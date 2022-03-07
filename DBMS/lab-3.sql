create table student
( 
	enrollment_no varchar(20),
	name varchar(25),
	cpi decimal(5,2),
	birthdate datetime
)

1.  alter table student add city varchar(20),backlog int not null

2.  alter table student alter column name varchar(35)

3.  alter table student alter column cpi int

4.  sp_rename 'student.enrollment_no' , 'eno','column'

5.  alter table student drop column city

6.  sp_rename 'student' , 'student_master'

7.  alter table student_master drop column backlog

8.  alter table student_master alter column name varchar(35) not null

9.  sp_rename 'student_master.birthdate','bdate','column'

10. alter table student_master alter column eno varchar(12)