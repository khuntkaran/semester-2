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





create procedure insertdata2 @rno int,@name varchar(50),@branch varchar(50) 
as
insert into student values(@rno,@name,@branch)

exec insertdata2 103,'sanjay','me'





1.	create procedure alldata 
	as 
	select * from student inner join result on student.rno=result.rno
	
	exec alldata


2.	create procedure enter_rollno @rno int
	as
	select * from student inner join result on student.rno=result.rno where student.rno = @rno

	alter procedure enter_rollno @rno int
	as
	select * from student full outer join result on student.rno=result.rno where student.rno = @rno

	exec enter_rollno 106


3.	create procedure insertdata107 
	as
	insert into student values(107,'raj','ee')

	exec insertdata107


4.	create procedure update105
	as
	update student set branch='ec' where rno=105

	exec update105


5.	create procedure delete103
	as
	delete from student where rno=103

	exec delete103

select * from student
