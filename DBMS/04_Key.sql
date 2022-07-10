create table city_master2
(
	cityid int not null primary key identity(101,1),
	cityname varchar(20) not null unique,
	pincode varchar(10) null,
	stdcode varchar(10)
)



create table students_master2
(
	studentid int not null primary key identity(101,1),
	enrollment_no varchar(20) not null unique,
	name varchar(25) not null,
	cpi decimal(5,2) null check(cpi<=10),
	joiningdate datetime not null default getdate(),
	bklog int not null check(bklog>0),
	cityid int not null foreign key references city_master2(cityid),
	statename varchar(50) default 'Gujarat'
)