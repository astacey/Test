
select COUNT(1) from accounts
select COUNT(1), time
from fact_data
where dataset in ( 3,4,5,6,7 )
group by Time	
order by Time

select COUNT(1), dataset, name
from fact_data f inner join dataset d on d.dataset_id=f.dataset
--where dataset in ( 2, 8, 9 )
group by dataset, name
order by dataset