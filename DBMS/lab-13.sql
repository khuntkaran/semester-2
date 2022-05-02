create table student3
(
	rno int primary key,
	name varchar(50),
	branch varchar(50),
	spi decimal(4,2),
	bklog int
)

insert into student3 values(101,'raju','ce','8.80',0)
insert into student3 values(102,'amit','ce','2.20',3)
insert into student3 values(103,'sanjay','me','1.50',6)
insert into student3 values(104,'neha','ec','7.65',1)
insert into student3 values(105,'meera','ee','5.52',2)
insert into student3 values(106,'mahesh','ec','4.50',3)

create table student3
(
	rno int primary key,
	name varchar(50),
	branch varchar(50),
	spi decimal(4,2),
	bklog int
)

insert into student3 values(101,'raju','ce','8.80',0)
insert into student3 values(102,'amit','ce','2.20',3)
insert into student3 values(103,'sanjay','me','1.50',6)
insert into student3 values(104,'neha','ec','7.65',1)
insert into student3 values(105,'meera','ee','5.52',2)
insert into student3 values(106,'mahesh','ec','4.50',3)

1.	create view vwPersonal
	as
	select * from student3

	select * from vwPersonal


2.	create view vwStudent_Details
	as
	select name,branch,spi from student3

	select * from vwStudent_Details


3.	create view vwAcademic
	as
	select rno,name,branch from student3

	select * from vwAcademic


4.	create view vwStudent_Data
	as
	select * from student3 where bklog >2

	select * from vwStudent_Data


5.	create view vwStudent_Patten
	as
	select rno,name,branch from student3 where name like '____'

	select * from vwStudent_Patten


6.	insert into vwAcademic values(107,'meet','me')

7.	update vwStudent_Details set branch='me' where name='amit'

8.	delete from vwAcademic where rno=104


9.	create view vwDisplay
	as
	select * from student3 where spi >9.5

	select * from vwDisplay


10.	create view vwDisplay1
	as
	select * from student3  where bklog =0

	select * from vwDisplay1
