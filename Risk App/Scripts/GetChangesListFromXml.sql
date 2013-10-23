

declare @file varchar(200)
declare @xml xml, @idoc int

select @file = MIN(fileName) from LogFiles where isnull(changes_processed,-1) <> 1

while @file is not null
begin

	select @xml = xmldata from LogFiles where FileName = @file

	EXEC sp_xml_preparedocument @idoc OUTPUT, @xml
		
	IF OBJECT_ID('tempdb..#tmp_xml') IS NOT NULL
		DROP TABLE #tmp_xml

	SELECT *
	into #tmp_xml
	FROM   OPENXML (@idoc, '//ArrayOfREGNRSItem',2)

	insert into changes ( DUNS_NBR, PRIM_NME, SRC_DT_RAW, TAG, VAL )
	select dunsval.text as DUNS_NBR, pnameval.text as PRIM_NME, convert(varchar(200),sd.text) as SRC_DT, changetag.localname, changetagval.text
	from #tmp_xml rt
	inner join #tmp_xml duns on duns.parentid=rt.id and duns.localname='DUNS_NBR'
	inner join #tmp_xml dunsval on dunsval.parentid=duns.id
	inner join #tmp_xml pname on pname.parentid=rt.id and pname.localname='PRIM_NME'
	inner join #tmp_xml pnameval on pnameval.parentid=pname.id
	inner join #tmp_xml a on a.parentid=rt.id and a.localname='NTFCRS'
	inner join #tmp_xml ArrayOfNTFCRSItem on ArrayOfNTFCRSItem.parentid=a.id and ArrayOfNTFCRSItem.localname='ArrayOfNTFCRSItem'
	inner join #tmp_xml srcdt on srcdt.parentid=ArrayOfNTFCRSItem.id and srcdt.localname='SRC_DT'
	inner join #tmp_xml sd on sd.parentid=srcdt.id
	inner join #tmp_xml changetag on changetag.parentid=ArrayOfNTFCRSItem.id and changetag.localname not in ( 'SRC_DT', 'DETECT_DT' )
	inner join #tmp_xml changetagval on changetagval.parentid=changetag.id

	delete from #tmp_xml
	
	update LogFiles set changes_processed=1 where FileName = @file
	
	print 'processed file ' + @file
	
	select @file = MIN(fileName) from LogFiles where FileName>@file and isnull(changes_processed,-1) <> 1
end