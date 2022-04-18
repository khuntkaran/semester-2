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
