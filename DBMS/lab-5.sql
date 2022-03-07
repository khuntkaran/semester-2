create table students
(
	stuid int,
	firstname varchar(25),
	lastname varchar(25),
	website varchar(50),
	city varchar(25),
	division varchar(20)
)

insert into students values(1011,'keyur','patel','techothenet.com','rajkot','ii-bcx')
insert into students values(1022,'hardik','shah','digminecraft.com','ahmedabad','i-bcy')
insert into students values(1033,'kajal','trivedi','bigactivities','baroda','iv-dcx')
insert into students values(1044,'bhoomi','gajera','checkyourmath.com','ahmedabad','iii-dcw')
insert into students values(1055,'harmit','mitel',null,'rajkot','ii-bcy')
insert into students values(1066,'ashok','jani',null,'baroda','ii-bcz')

select * from students where firstname like 'k%'

select * from students where firstname like '_____'

select firstname,lastname from students where city like '_____%a'

select * from students where lastname like '%tel'

select * from students where firstname like 'ha%t'

select * from students where firstname like 'k_y%'

