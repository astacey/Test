cd c:\Importer
java -jar Importer.jar -bm "c:\ImportData\Unit4FinalFile7Plus.csv" -masterid "Customer ID" -mappingid "DUNS" -mappingtype dnb -mappingGrade "match Grade" -mappingConfidence "Conf Code"
cd C:\Importer\ETLScripts
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_2_loadIntTables.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_4_stageValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_5_removeValid.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_7_addMissingGenId.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_8_updateDimensions.sql"
sqlcmd -U SupplierETL -P Andrew1 -S WIN-5EA09PGPTVH -i "update3_9_incrementFacts.sql"
sqlcmd -U ExieOwner01 -P Manager1 -S WIN-5EA09PGPTVH -i "update3_10_truncateTables.sql"
cd c:\Importer
ascmd -i "ProcessCube.xmla"