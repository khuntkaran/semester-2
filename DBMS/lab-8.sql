create table student_mark
(
	sid int not null,
	sname varchar(50) not null,
	marks int not null
)

insert into student_mark values(1,'john',90)
insert into student_mark values(2,'martin',80)
insert into student_mark values(3,'carol',89)
insert into student_mark values(4,'jack',99)
insert into student_mark values(5,'rose',88)
insert into student_mark values(6,'mary',90)

select count(sid) from student_mark

select sum(marks) from student_mark

select avg(marks) from student_mark

select min(marks) from student_mark

select max(marks) from student_mark

========================================================================================

create table employee
(
	eid int not null,
	ename varchar(50) not null,
	department varchar(50) not null,
	salary decimal(8,2) not null,
	joiningdate datetime not null,
	city varchar(50) not null
)

insert into employee values(101,'rahul','admin',56000,'1990-01-01','rajkot')
insert into employee values(102,'hardik','it',18000,'1990-10-25','ahmedabad')
insert into employee values(103,'bhavin','hr',25000,'1991-05-14','baroda')
insert into employee values(104,'bhoomi','admin',39000,'1991-02-08','rajkot')
insert into employee values(105,'rohit','it',17000,'1990-07-23','jamnagar')
insert into employee values(106,'priya','it',9000,'1990-10-18','ahmedabad')
insert into employee values(107,'neha','hr',34000,'1991-12-25','rajkot')

select max(salary) as 'maximum_salary',min(salary) as 'minimum_salary',sum(salary)as 'total_salary',avg(salary)as 'average_salary' from employee

select count(eid) from employee

select max(salary) from employee where department='it'

select count(distinct city) from employee

select  city,count(*) from employee GROUP BY city

select city  from employee GROUP BY city having count(*)>1

select  department,sum(salary) from employee GROUP BY department

8.  select avg(salary) from employee GROUP BY department