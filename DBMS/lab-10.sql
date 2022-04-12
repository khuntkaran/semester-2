create table student
(
	rno int,
	name varchar(50),
	branch varchar(50)
)

create table result
(
	rno int,
	spi decimal(4,2)
)

create table employee2
(
	employeeno varchar(50),
	name varchar(50),
	managerno varchar(50)
)

insert into student values(101,'raju','ce')
insert into student values(102,'amit','ce')
insert into student values(103,'sanjay','me')
insert into student values(104,'neha','ec')
insert into student values(105,'meera','ee')
insert into student values(106,'mahesh','me')

insert into result values(101,8.8)
insert into result values(102,9.2)
insert into result values(103,7.6)
insert into result values(104,8.2)
insert into result values(105,7.0)
insert into result values(107,8.9)

insert into employee2 values('E01','tarun',null)
insert into employee2 values('E02','rohan','E02')
insert into employee2 values('E03','priya','E01')
insert into employee2 values('E04','milan','E03')
insert into employee2 values('E05','jay','E01')
insert into employee2 values('E06','anjana','E04')

1.	select * 
	from student
	cross join result

2.	select student.rno,name,branch,spi
	from student
	left outer join result
	on student.rno = result.rno
	where branch='ce'

3.	select student.rno,name,branch,spi
	from student
	left outer join result
	on student.rno = result.rno
	where branch='ec'




7.	select *
	from student
	left outer join result
	on student.rno=result.rno

8.	select *
	from student
	right outer join result
	on student.rno=result.rno

9.	select *
	from student
	full outer join result
	on student.rno=result.rno