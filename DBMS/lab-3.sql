alter table student_master drop column backlog

alter table student_master alter column name varchar(35) not null

sp_rename 'student_master.burthdate','bdate','column'

alter table student_master alter column eno varchar(12)