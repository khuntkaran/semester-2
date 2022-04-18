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

4.	select branch ,AVG(spi)
	from student
	inner join result
	on student.rno=result.rno
	group by branch

5.	select branch ,AVG(spi)
	from student
	inner join result
	on student.rno=result.rno
	group by branch
	order by avg(spi) 

6.	select branch ,AVG(spi)
	from student
	inner join result
	on student.rno=result.rno
	where branch in ('ce','me') 

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
	
10.	select m.name ,e.name
	from empioyee e
	right join empioyee m
	on e.employeeno=m.managerno

==============================================================================================================================

create table city
(
	cityid int primary key identity(1,1),
	cityname varchar(50)  unique,
	pincode varchar(6),
	remark varchar(250)
)

create table village
(
	villageid int primary key identity(101,1),
	villagename varchar(25) ,
	cityid int foreign key references city(cityid),
)

insert into city values('rajkot','360005','good')
insert into city values('surat','335009','very good')
insert into city values('baroda','390001','awesome')
insert into city values('jamnagar','361003','smart')
insert into city values('junagadh','362229','historic')
insert into city values('morbi','363641','ceramic')

insert into village values('raiya',1)
insert into village values('madhapar',1)
insert into village values('dodka',3)
insert into village values('falla',4)
insert into village values('bhesan',5)
insert into village values('dhoraji',5)

select villagename 
from village
left outer join city
on village.cityid=city.cityid
where city.cityid=1

select cityname,villagename ,pincode
from village
left outer join city
on village.cityid=city.cityid

select cityname,count(village.cityid)
from city
inner join village
on city.cityid=village.cityid
group by cityname
having count(village.cityid)>1

select cityname,count(village.cityid)
from city
left outer join village
on city.cityid=village.cityid
group by cityname
having count(village.cityid) =0

select cityname,count(village.cityid)
from city
left outer join village
on city.cityid=village.cityid
group by cityname

select count(cityname)
from city
inner join village
on city.cityid=village.cityid
where city.cityid>1
group by cityname
having count(village.cityid)>1
