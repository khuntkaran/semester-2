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

1.  select * from students where firstname like 'k%'

2.  select * from students where firstname like '_____'

3.  select firstname,lastname from students where city like '_____%a'

4.  select * from students where lastname like '%tel'

5.  select * from students where firstname like 'ha%t'

6.  select * from students where firstname like 'k_y%'

7.  select * from students where  website is null and firstname like '_____'

8.  select * from students where firstname like '%jer'

9.  select * from students where city like '[r,b]%'

10. select * from students where website is not null 

11. select * from students where firstname like '[a,h]%'

12. select * from students where firstname like '_[a,e,i,o,u]%'

13. select * from students where city like '%rod%'

14. select firstname,lastname from students where website like 'bi%'

15. select city from students where lastname like '______'

16. select * from students where city not like 'ba%' and city like '______'

17. select * from students where division like 'ii%'

18. select firstname from students where division like '%bc%'

19. select stuid,city from students where division like '______' and  website is not null 

20. select * from students where firstname not like '__[a,e,i,o,u]%'