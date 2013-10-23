
declare @file varchar(200)

select @file = MIN(fileName) from LogFiles where isnull(changes_processed,-1) <> 1

while @file is not null
begin
	begin try
		update LogFiles set xmldata = CONVERT(xml, data) where FileName = @file
	end try
	begin catch
		print 'failed filename - ' + @file
	end catch
	select @file = MIN(fileName) from LogFiles where FileName>@file and isnull(changes_processed,-1) <> 1
end