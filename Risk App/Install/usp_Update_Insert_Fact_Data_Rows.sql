/****** Object:  StoredProcedure [dbo].[usp_Update_Insert_Fact_Data_Rows]    Script Date: 06/05/2013 10:21:12 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[usp_Update_Insert_Fact_Data_Rows]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[usp_Update_Insert_Fact_Data_Rows]
GO

CREATE PROCEDURE usp_Update_Insert_Fact_Data_Rows
AS

-- Update existing fact rows
update f set value = u.value
from fact_data f
inner join 
(
	select t.value,t.Time,d_1.accounts_id,d_2.dataset_id 
	from stg_fact_data t inner join accounts d_1 on t.accounts = d_1.gen_id inner join dataset d_2 on t.dataset = d_2.gen_id
) u on u.accounts_id=f.accounts and u.Time=f.Time and u.dataset_id=f.dataset

-- insert new fact rows
insert into fact_data(value,Time,accounts,dataset)  
select t.value,t.Time,d_1.accounts_id,d_2.dataset_id 
from stg_fact_data t left join accounts d_1 on t.accounts = d_1.gen_id left join dataset d_2 on t.dataset = d_2.gen_id
where not exists ( select 1 from fact_data f1 where f1.accounts=d_1.accounts_id and f1.dataset=d_2.dataset_id and f1.Time=t.Time )

GO

GRANT EXECUTE ON usp_Update_Insert_Fact_Data_Rows TO SupplierETL

GO
