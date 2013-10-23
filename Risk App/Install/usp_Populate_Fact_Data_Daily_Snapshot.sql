
/****** Object:  StoredProcedure [dbo].[usp_Populate_Fact_Data_Daily_Snapshot]    Script Date: 06/05/2013 10:21:12 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Populate_Fact_Data_Daily_Snapshot]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Populate_Fact_Data_Daily_Snapshot]
GO

CREATE PROCEDURE usp_Populate_Fact_Data_Daily_Snapshot ( @StartDate DATETIME = NULL )
AS

DECLARE @CurrDate DATETIME, @EndDate DATETIME

IF ( @StartDate IS NOT NULL )
	Set @CurrDate = @StartDate
ELSE
BEGIN
	SELECT @CurrDate = DATEADD(mm, -2, getutcdate()) -- By default update the last 2 months only
	-- remove time element - causes duplicates
	SET @CurrDate = CONVERT(DateTime, CONVERT(VarChar(4),DATEPART(yyyy,@CurrDate)) + '-' + CONVERT(VarChar(2),DATEPART(mm,@CurrDate)) + '-' + CONVERT(VarChar(2),DATEPART(dd,@CurrDate)))
END

SET @EndDate = DATEADD(dd,7,getutcdate())

-- if the temp tables exists, drop. shouldn't exist but just in case
IF OBJECT_ID('tempdb..#tmpCurrentValues') IS NOT NULL
	DROP TABLE #tmpCurrentValues
IF OBJECT_ID('tempdb..#tmpDates') IS NOT NULL
	DROP TABLE #tmpDates
create table #tmpDates ( TheDate DateTime NOT NULL)
IF OBJECT_ID('tempdb..#tmpBaseRows') IS NOT NULL
	DROP TABLE #tmpBaseRows
create table #tmpBaseRows ( TheDate DateTime NOT NULL, dataset INT NOT NULL, accounts INT NOT NULL )	

-- populate temp table with current values
select value, f.dataset, f.accounts
INTO #tmpCurrentValues
from fact_data f
inner join -- get the most recent value before @CurrDate
(
	select MAX(time) as MaxTime, accounts, dataset
	from fact_data 
	group by accounts, dataset
) a on a.accounts=f.accounts and a.dataset=f.dataset and f.Time=a.MaxTime
inner join dataset d on d.dataset_id=f.dataset where d.dailysnapshot=1

-- remove existing rows that fall into date range
DELETE FROM fact_data_daily_snapshot where Time >= @CurrDate

-- Build tmp table of dates
WHILE @CurrDate < @EndDate
BEGIN
	insert into #tmpDates VALUES ( @CurrDate )

	SET @CurrDate = DATEADD(dd, 1, @CurrDate)
END

-- set up base rows for fact_data_snapshot daily - 1 row per day, for each account/dataset pair
insert into #tmpBaseRows ( theDate, accounts, dataset )
select theDate, a.accounts_id, d.dataset_id
from #tmpDates
cross join accounts a
cross join dataset d
where d.DailySnapshot=1

-- create Index on #tmpBaseRows to help the next query
create index IX_tmpDates On #tmpBaseRows ( dataset, accounts, theDate )

-- insert the new fact rows
-- for each date, we use the most recent value prior to the date
-- if there is no value prior to the date, we use 0 for the value BUT we use the next available value after the date to work out delta and percentage
-- why ?
-- example
-- company 1
-- fact data has 2 rows ( time, value, delta vs current )
-- 01/01/2013, 1000, 1000
-- 05/01/2013, 2000, 0
-- company 2
-- 01/01/2013, 500, 0
-- Current date is 07/01/2013.
-- The value 8 days ago ( 31/12/2012 ) was null for both companies, which we treat as 0.
-- If I'm filtering on the delta > 200 since 8 days ago, I want to include company 1, becase it has changed, but exclude company 2 because it hasn't changed
-- achieve this by regarding the delta as being the earliest available - 1000 for company 1, 0 for company 2
insert into fact_data_daily_snapshot ( value, Time, dataset, accounts, delta_against_current, percent_against_current )
select
	COALESCE(curr.value, 0) as THE_VALUE,
	a.TheDate as THE_DATE,
	a.dataset as THE_DATASET,
	a.accounts as THE_ACCOUNTS,
	cv.value-COALESCE(curr.value,nxt.value) as THE_DELTA,
	(( cv.value-COALESCE(curr.value,nxt.value) ) / nullif(COALESCE(curr.value,nxt.value),0)) * 100 as THE_DELTA_PERCENT	
from 
(
	select MAX(f1.Time) as maxTime, MIN(f2.Time) as minTime, b.TheDate, b.accounts, b.dataset
	from #tmpBaseRows b
	left join fact_data f1 on f1.dataset=b.dataset and b.accounts=f1.accounts and f1.Time <= TheDate -- this is null if there was no value prior to b.TheDate
	left join fact_data f2 on f2.dataset=b.dataset and b.accounts=f2.accounts and f2.Time > TheDate -- this will be the value to use if f1 is null - i.e. the next available value in the future ( will almost always be the first value we downloaded/imported for this dataset )
	group by b.TheDate, b.accounts, b.dataset
) a
inner join #tmpCurrentValues cv on cv.dataset=a.dataset and cv.accounts=a.accounts
left join fact_data curr on a.dataset=curr.dataset and a.accounts=curr.accounts and a.maxTime=curr.time -- use this value if available
left join fact_data nxt on a.dataset=nxt.dataset and a.accounts=nxt.accounts and a.minTime=nxt.time -- otherwise fall back to this

GO

GRANT EXECUTE ON usp_Populate_Fact_Data_Daily_Snapshot TO SupplierETL

GO
