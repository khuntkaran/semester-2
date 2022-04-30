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

1.	create view vwPersonal1 
	as
	select * from student3

	select * from vwPersonal1


2.	create view vwStudent_Details3
	as
	select name,branch,spi from student3

	select * from vwStudent_Details3


3.	create view vwAcademic2
	as
	select rno,name,branch from student3

	select * from vwAcademic2


4.	create view vwStudent_Data2
	as
	select * from student3 where bklog >2

	select * from vwStudent_Data2


5.	create view vwStudent_Patten4
	as
	select rno,name,branch from student3 where name like '____'

	select * from vwStudent_Patten4


6.	insert into vwAcademic2 values(107,'meet','me')

7.	update vwStudent_Details3 set branch='me' where name='amit'

8.	delete from vwAcademic2 where rno=104


9.	create view vwDisplay2
	as
	select * from student3 where spi >9.5

	select * from vwDisplay2


10.	create view vwDisplay3
	as
	select * from student3  where bklog =0

	select * from vwDisplay3
