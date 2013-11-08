cd c:\Importer
java -jar Importer.jar -xabw "C:\ImportData" -f "UKU4"
cd C:\Importer\ETLScripts
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_2_loadIntTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_4_stageValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_5_removeValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_7_addMissingGenId.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_8_updateDimensions.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_9_incrementFacts.sql"
sqlcmd -U ExieOwner01 -P Manager1 -S WIN-OAPNH07IFK4 -i "update3_10_truncateTables.sql"
cd c:\Importer
java -jar Importer.jar -rdnb -xdnb -u unit4test -p ed1r1ver
cd C:\Importer\ETLScripts
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_2_loadIntTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_4_stageValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_5_removeValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_7_addMissingGenId.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_8_updateDimensions.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -i "update3_9_incrementFacts.sql"
sqlcmd -U ExieOwner01 -P Manager1 -S WIN-OAPNH07IFK4 -i "update3_10_truncateTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-OAPNH07IFK4 -Q "exec usp_Post_Update_Processing"
cd c:\Importer
ascmd -i "ProcessCube.xmla"