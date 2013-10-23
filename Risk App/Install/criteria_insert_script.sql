set identity_insert criteria on

insert into criteria ( criteria_id, gen_id, name, parent )
	values ( 1, '1', 'All', 1 )
	
insert into criteria ( criteria_id, gen_id, name, parent )
	values ( 2, '2', 'At Risk', 1 )
insert into criteria ( criteria_id, gen_id, name, parent )
	values ( 3, '3', 'All Companies', 1 )
	go
set identity_insert criteria off
