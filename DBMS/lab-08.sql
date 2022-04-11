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

1.	select  max(salary) as 'maximum_salary',
		min(salary) as 'minimum_salary',
		sum(salary)as 'total_salary',
		avg(salary)as 'average_salary'
	from employee

2.	select count(eid) 
	from employee

3.	select max(salary) 
	from employee 
	where department='it'

4.	select count(distinct city) 
	from employee

5.	select  city,count(*) 
	from employee 
	GROUP BY city

6.	select city  
	from employee 
	GROUP BY city 
	having count(*)>1

7.	select  department,sum(salary) 
	from employee 
	GROUP BY department

8.	select avg(salary) 
        from employee 
        GROUP BY department

9.	select min(salary) 
	from employee
	where city='ahmedabad'

10.	select department,sum(salary)
	from employee
	where city='rajkot'
	group by department
	having sum(salary)>50000

11.	select count(eid)
	from employee
	where city='rajkot'

12.	select max(salary)-min(salary) as sal_difference
	from employee

13.	select count(joiningdate)
	from employee
	where joiningdate <'1991-01-01'

14.	select department,sum(salary)
	from employee
	group by department
	having sum(salary)>35000
	order by sum(salary)

15.	select department,count(*)
	from employee
	group by department
	having count(*)>2

16.	select  min(salary)
	from employee
	where city='rajkot'

17.	select city, count(*)
	from employee
	group by city

18.	select department,min(salary)
	from employee
	group by department

19.	select sum(salary)
	from employee
	group by city

20.	select department,max(salary),min(salary),sum(salary)
	from employee
	group by department
