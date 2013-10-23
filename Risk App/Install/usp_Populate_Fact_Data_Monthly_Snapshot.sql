
/****** Object:  StoredProcedure [dbo].[usp_Populate_Fact_Data_Monthly_Snapshot]    Script Date: 06/05/2013 10:21:12 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Populate_Fact_Data_Monthly_Snapshot]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Populate_Fact_Data_Monthly_Snapshot]
GO

CREATE PROCEDURE usp_Populate_Fact_Data_Monthly_Snapshot ( @StartDate DATETIME = NULL )
AS

DECLARE @CurrDate DATETIME, @EndDate DATETIME

IF ( @StartDate IS NOT NULL )
	Set @CurrDate = @StartDate
ELSE
	SELECT @CurrDate = DATEADD(mm, -12, getutcdate()) -- By default update the last year only
-- Always start and finish on 1st of month, finish next month, just to make sure that the graph doesn't drop down to nothing when we change months ( update might be delayed a day or two for some reason )
SET @CurrDate = CONVERT(DateTime, CONVERT(VarChar(4),DATEPART(yyyy,@CurrDate)) + '-' + CONVERT(VarChar(2),DATEPART(mm,@CurrDate)) + '-01')
SET @EndDate = DATEADD(mm, 1, getutcdate())
SET @EndDate = CONVERT(DateTime, CONVERT(VarChar(4),DATEPART(yyyy,@EndDate)) + '-' + CONVERT(VarChar(2),DATEPART(mm,@EndDate)) + '-01')

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
DELETE FROM fact_data_monthly_snapshot where Time >= @CurrDate

-- Build tmp table of dates
WHILE @CurrDate <= @EndDate
BEGIN
	insert into #tmpDates VALUES ( @CurrDate )

	SET @CurrDate = DATEADD(mm, 1, @CurrDate)
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
-- if there is no value prior to the date, we use 0 for the value 
insert into fact_data_monthly_snapshot ( value, Time, dataset, accounts )
select
	COALESCE(curr.value, 0) as THE_VALUE,
	a.TheDate as THE_DATE,
	a.dataset as THE_DATASET,
	a.accounts as THE_ACCOUNTS
from 
(
	select MAX(f1.Time) as maxTime, b.TheDate, b.accounts, b.dataset
	from #tmpBaseRows b
	left join fact_data f1 on f1.dataset=b.dataset and b.accounts=f1.accounts and f1.Time <= TheDate
	group by b.TheDate, b.accounts, b.dataset
) a
inner join #tmpCurrentValues cv on cv.dataset=a.dataset and cv.accounts=a.accounts
left join fact_data curr on a.dataset=curr.dataset and a.accounts=curr.accounts and a.maxTime=curr.time

GO

GRANT EXECUTE ON usp_Populate_Fact_Data_Monthly_Snapshot TO SupplierETL

GO
