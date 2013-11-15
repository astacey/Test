
/****** Object:  StoredProcedure [dbo].[usp_Handle_Remapped]   ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Handle_Remapped]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Handle_Remapped]
GO


CREATE PROCEDURE [dbo].[usp_Handle_Remapped]
AS

-- Check for accounts with DnB_STATUS == 'REMAPPED'
-- or a null duns ( unmapped companies )
-- Delete all D&B related facts
-- UPDATE DnB_STATUS to be NULL ( Unregistered, which will then trigger the getting of initial facts and registering for updates )
-- Actually this step is pointless and potentially confusing. It will mean the accounts table is out of sync with 
-- Experian - not handled yet

	DELETE FROM FACT_DATA 
	WHERE accounts IN ( SELECT Accounts_ID FROM ACCOUNTS WHERE DnB_STATUS = 'REMAPPED' OR duns_no is null )
	AND DATASET IN ( 3,4,5,6,7,16,17,18 ) -- hardcoded for now, add flag to dataset table later
	DELETE FROM FACT_DATA_DAILY_SNAPSHOT 
	WHERE accounts IN ( SELECT Accounts_ID FROM ACCOUNTS WHERE DnB_STATUS = 'REMAPPED' OR duns_no is null )
		AND DATASET IN ( 3,4,5,6,7,16,17,18 ) -- hardcoded for now, add flag to dataset table later
	DELETE FROM FACT_DATA_MONTHLY_SNAPSHOT 
	WHERE accounts IN ( SELECT Accounts_ID FROM ACCOUNTS WHERE DnB_STATUS = 'REMAPPED' OR duns_no is null )
		AND DATASET IN ( 3,4,5,6,7,16,17,18 ) -- hardcoded for now, add flag to dataset table later

GO

GRANT EXECUTE ON usp_Handle_Remapped TO SupplierETL

GO

