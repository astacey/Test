
/****** Object:  StoredProcedure [dbo].[usp_Post_Update_Processing]   ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Post_Update_Processing]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Post_Update_Processing]
GO


CREATE PROCEDURE [dbo].[usp_Post_Update_Processing]
AS

EXEC [dbo].[usp_Handle_Remapped]
EXEC [dbo].[usp_Populate_Fact_Data_Daily_Snapshot]
EXEC [dbo].[usp_Populate_Fact_Data_Monthly_Snapshot]

GO


GRANT EXECUTE ON usp_Post_Update_Processing TO SupplierETL

GO

