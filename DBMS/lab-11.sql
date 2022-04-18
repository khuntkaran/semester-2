create table student2
(
	rno int,
	name varchar(50),
	city varchar(50),
	did int
)

create table academic
(
	rno int,
	spi decimal(4,2),
	bklog int
)

create table department
(
	did int,
	dname varchar(50)
)

insert into student2 values(101,'raju','rajkot',10)
insert into student2 values(102,'amit','ahmedabad',20)
insert into student2 values(103,'sanjay','baroda',40)
insert into student2 values(104,'neha','rajkot',20)
insert into student2 values(105,'meera','ahmedabad',30)
insert into student2 values(106,'mahesh','baroda',10)

insert into academic values(101,'8.8',0)
insert into academic values(102,'9.2',2)
insert into academic values(103,'7.6',1)
insert into academic values(104,'8.2',4)
insert into academic values(105,'7.0',2)
insert into academic values(106,'8.9',3)

insert into department values(10,'computer')
insert into department values(20,'electrical')
insert into department values(30,'mechanical')
insert into department values(40,'civil')

1.	select * 
	from student2
	left outer join department
	on student2.did=department.did
	where dname='computer'

2.	select name
	from student2
	left outer join academic
	on student2.rno=academic.rno
	where spi>8

3.	select * 
	from student2
	left outer join department
	on student2.did=department.did
	where dname='computer' and city='rajkot'

4.	select COUNT(name)
	from student2
	inner join department
	on student2.did=department.did
	where dname='electrical'

5.	

6.`	select *
	from student2
	inner join academic
	on student2.rno=academic.rno
	where bklog>1

7.