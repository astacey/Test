

CREATE LOGIN [SupplierETL] WITH PASSWORD=N'Andrew1', DEFAULT_DATABASE=[ExieDb01], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON
GO

grant ADMINISTER BULK OPERATIONS To SupplierETL
GO

USE [ExieDb01]
GO

/****** Object:  User [ExieOwner01]    Script Date: 05/13/2013 10:55:17 ******/
GO

CREATE USER [SupplierETL] FOR LOGIN [SupplierETL] WITH DEFAULT_SCHEMA=[dbo]
GO

sp_addrolemember 'db_datareader', 'SupplierETL'
GO
sp_addrolemember 'db_datawriter', 'SupplierETL'
GO

USE [msdb]
GO
CREATE USER [SupplierETL] FOR LOGIN [SupplierETL] WITH DEFAULT_SCHEMA=[dbo]
GO
GRANT EXECUTE ON sp_Start_Job TO [SupplierETL]
GO
sp_addrolemember 'SQLAgentUserRole', 'SupplierETL'
GO