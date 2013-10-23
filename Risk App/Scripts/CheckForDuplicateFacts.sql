-- true duplicates
select accounts, dataset, time, value, count(1)
from fact_data
where accounts is not null
group by accounts, dataset, time, value
having COUNT(1) > 1
order by accounts, dataset, Time, value

-- same dataset updated on same day - arrghhhh !!!
select accounts, dataset, time, count(1)
from fact_data
group by accounts, dataset, time
having COUNT(1) > 1

--delete f from fact_data f
--where exists ( select 1 from fact_data f1
--inner join accounts a on a.accounts_id=f1.accounts
--where accounts is not null  and f1.accounts=f.accounts and f1.time=f.Time and f1.value=f.value and f.dataset=f1.dataset
--group by gen_id, dataset, time, value
--having COUNT(1) > 1 )

--select 'insert into fact_data ( accounts, dataset, time, value) values ( ' + convert(varchar(100),accounts) + ', ' + convert(varchar(100),dataset) +', ''' + convert(varchar(100),Time) + ''', ' + convert(varchar(100),value) + ')
--'
--from fact_data
--group by accounts, dataset, time, value
--having COUNT(1) > 1

--select 'delete from fact_data where  accounts=' + convert(varchar(100),accounts) + ' and dataset=' + convert(varchar(100),dataset) +' and time = ''' + convert(varchar(100),Time) + ''' and value=' + convert(varchar(100),value) + '
--'
--from fact_data
--group by accounts, dataset, time, value
--having COUNT(1) > 1
