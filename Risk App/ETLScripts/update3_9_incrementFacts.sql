 insert into comment(name,user_id,creation_time,header,comment,crosspoint,crosspointInTime,type)  select t.name,t.user_id,t.creation_time,t.header,t.comment,t.crosspoint,t.crosspointInTime,d_1.t_comment_id from stg_comment t ,t_comment  d_1 where d_1.gen_id = t.type;
 insert into generator_version(deployed_date,deployed_version)  select t.deployed_date,t.deployed_version from stg_generator_version t ;
 insert into exie_fact_usage(exie_username,exie_solution,exie_operation,exie_report,Time,count)  select t.exie_username,t.exie_solution,t.exie_operation,t.exie_report,t.Time,t.count from stg_exie_fact_usage t ;
 insert into f_feproperty(t_feproperty,kpi,feproperty)  select d_1.t_feproperty_id,d_2.kpi_id,t.feproperty from stg_f_feproperty t left join t_feproperty d_1 on t.t_feproperty = d_1.gen_id left join kpi d_2 on t.kpi = d_2.kpi_id ;
 insert into fact_criteria(dummy_value,threshold,delta_value,delta_percentage,delta_days,dataset,criteria,connection_type)  select t.dummy_value,t.threshold,t.delta_value,t.delta_percentage,t.delta_days,d_1.dataset_id,d_2.criteria_id,d_3.connection_type_id from stg_fact_criteria t left join dataset d_1 on t.dataset = d_1.gen_id left join criteria d_2 on t.criteria = d_2.gen_id left join connection_type d_3 on t.connection_type = d_3.gen_id ;
 -- start custom section, modified by Andy 2013-06-05
 -- this is to make it easier to avoid duplicate facts, basically if the dataset, time, accounts combination already exists in the fact_data table, then don't insert, just update
 exec usp_Update_Insert_Fact_Data_Rows;
 -- end custom section
