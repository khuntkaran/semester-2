create database karan

create table deposit
(
	actno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2),
	adate datetime
)

create table branch
(
	bname varchar(50),
	city varchar(50),
)

create table customers
(
	cname varchar(50),
	city varchar(50)
)

create table borrow 
(
	loanno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2)
)

insert into deposit values(101,'anil','vrce',1000,'1995-03-01')
insert into deposit values(102,'sunil','ajni',5000,'1996-01-04')
insert into deposit values(103,'mehul','karolbagh',3500,'1995-11-17')
insert into deposit values(104,'madhuri','chandi',1200,'1995-12-17')
insert into deposit values(105,'prmod','m.g.road',3000,'1996-03-27')
insert into deposit values(106,'sandip','andheri',2000,'1996-03-31')
insert into deposit values(107,'shivani','virar',1000,'1995-09-05')
insert into deposit values(108,'kranti','nehru place',5000,'1995-07-02')
insert into deposit values(109,'minu','powai',7000,'1995-08-10')

select * from deposit

insert into branch values('vrce','nagpur')
insert into branch values('ajni','nagpur')
insert into branch values('karolbagh','delhi')
insert into branch values('chandi','delhi')
insert into branch values('dharampeth','nagpur')
insert into branch values('m.g.road','banglore')
insert into branch values('andheri','bombay')
insert into branch values('virar','bombay')
insert into branch values('nehru place','delhi')
insert into branch values('powai','bombay')

select * from branch

insert into customers values('anil','calcutta')
insert into customers values('sunil','delhi')
insert into customers values('mehul','baroda')
insert into customers values('mandar','patan')
insert into customers values('madhuri','nagpur')
insert into customers values('pramod','nagpur')
insert into customers values('sandip','surat')
insert into customers values('shivani','bombay')
insert into customers values('kranti','bombay')
insert into customers values('naren','bombay')

select * from customers

insert into borrow values(201,'anil','vrce',1000)
insert into borrow values(206,'mehul','ajni',5000)
insert into borrow values(311,'sunil','dharampeth',3000)
insert into borrow values(321,'madhuri','andheri',2000)
insert into borrow values(375,'prmod','virar',8000)
insert into borrow values(481,'kranti','nehru place',3000)

select * from borrow

select actno,cname,amount from deposit

select loanno,amount from borrow

select * from borrow where bname='andheri'