set identity_insert connection_type on

insert into connection_type ( connection_type_id, gen_id, name, parent_id, is_multiple )
	values ( 1, 'BA', 'Business Area - Action Connection', 1, 0 )
insert into connection_type ( connection_type_id, gen_id, name, parent_id, is_multiple )
	values ( 2, 'KPI', 'KPI - Action Connection', 2, 0 )
insert into connection_type ( connection_type_id, gen_id, name, parent_id, is_multiple )
	values ( 3, 'CD', 'Criteria - Action Connection', NULL, 1 )
	go
set identity_insert connection_type off
