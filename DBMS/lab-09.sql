/*set operators*/
create table computer
(
	roll_no int,
	name varchar(50)
)
create table electrical
(
	roll_no int,
	name varchar(50)
)

insert into computer values(101,'ajay')
insert into computer values(109,'haresh')
insert into computer values(115,'manish')

insert into electrical values(105,'ajay')
insert into electrical values(107,'mahesh')
insert into electrical values(115,'manish')

1.	select name from computer union select name from electrical

2.	select name from computer union all select name from electrical

3.	select name from computer intersect select name from electrical

4.	select name from computer except select name from electrical

5.	select name from electrical except select name from computer 

6.	select * from computer union select * from electrical

7.	select * from computer intersect select * from electrical

/*into*/
create table cricket
(
	name varchar(50),
	city varchar(50),
	age int
)

insert into cricket values('sachin tendulkar','mumbai',30)
insert into cricket values('rahul dravid','bombay',35)
insert into cricket values('m.s.dhoni','jharkhand',31)
insert into cricket values('suresh raina','gujarat',30)

1.	select * into world_cup from cricket

2.	select name,city into t_20 from cricket where 1=2

3.	select * into ipl from cricket where 1=2

4.	insert into ipl select * from cricket where name like '_a_____'

5.	truncate table ipl

6.	delete from cricket where city='jharkhand'

7.	sp_rename 'ipl','ipl2018'

8.	drop table t_20