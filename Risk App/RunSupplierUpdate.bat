cd c:\DnBImporter
java -jar DnBImporter.jar -xabw "C:\ImportData" -f "UKU4"
cd C:\DnBImporter\ETLScripts
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_2_loadIntTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_4_stageValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_5_removeValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_7_addMissingGenId.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_8_updateDimensions.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_9_incrementFacts.sql"
sqlcmd -U ExieOwner01 -P Manager1 -S WIN-5EA09PGPTVH -i "update3_10_truncateTables.sql"
cd c:\DnBImporter
java -jar DnBImporter.jar -rdnb -xdnb -u unit4test -p ed1r1ver
cd C:\DnBImporter\ETLScripts
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_2_loadIntTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_4_stageValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_5_removeValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_7_addMissingGenId.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_8_updateDimensions.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_9_incrementFacts.sql"
sqlcmd -U ExieOwner01 -P Manager1 -S WIN-5EA09PGPTVH -i "update3_10_truncateTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -Q "exec usp_Populate_Fact_Data_Daily_Snapshot"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -Q "exec usp_Populate_Fact_Data_Monthly_Snapshot"
cd c:\DnBImporter
ascmd -i "ProcessCube.xmla"