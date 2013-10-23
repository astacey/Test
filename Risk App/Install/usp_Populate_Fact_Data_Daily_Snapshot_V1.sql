
/****** Object:  StoredProcedure [dbo].[usp_Populate_Fact_Data_Daily_Snapshot]    Script Date: 06/05/2013 10:21:12 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Populate_Fact_Data_Daily_Snapshot]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Populate_Fact_Data_Daily_Snapshot]
GO

CREATE PROCEDURE usp_Populate_Fact_Data_Daily_Snapshot
AS

delete from fact_data_daily_snapshot

DECLARE @CurrDate DATETIME, @EndDate DATETIME

SELECT @CurrDate = MIN(Time) from fact_data f inner join dataset d on d.dataset_id=f.dataset where d.dailysnapshot=1

SET @EndDate = DATEADD(dd,7,getutcdate())

-- if the temp table exists, drop. shouldn't exist but just in case
IF OBJECT_ID('tempdb..#tmpCurrentValues') IS NOT NULL
	DROP TABLE #tmpCurrentValues
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

print 'initial loop'
-- loop and fill in all the dates
WHILE @CurrDate < @EndDate
BEGIN
	print @CurrDate
    -- delta is current value minus value on the given date.
    -- percentage increase ( negative means it decreased ). percentage increase of anything from 0 is infinite?? NaN?? just Null will do me
	insert into fact_data_daily_snapshot ( value, Time, dataset, accounts, delta_against_current, percent_against_current )
	select f.value, @CurrDate, f.dataset, f.accounts, 
		cv.value - f.value,
		( cv.value - f.value ) / nullif(f.value,0) * 100
	from fact_data f
	inner join -- get the most recent value before @CurrDate
	(
		select MAX(time) as MaxTime, accounts, dataset
		from fact_data 
		where Time <= @CurrDate
		group by accounts, dataset
	) a on a.accounts=f.accounts and a.dataset=f.dataset and f.Time=a.MaxTime
	inner join #tmpCurrentValues cv on cv.accounts=f.accounts and cv.dataset=f.dataset
	inner join dataset d on d.dataset_id=f.dataset where d.dailysnapshot=1
	 
	SET @CurrDate = DATEADD(dd, 1, @CurrDate)
END

GO

GRANT EXECUTE ON usp_Populate_Fact_Data_Daily_Snapshot TO SupplierETL

GO
