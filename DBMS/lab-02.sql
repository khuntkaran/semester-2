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
	city varchar(50)
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

insert into borrow values(201,'anil','vrce',1000)
insert into borrow values(206,'mehul','ajni',5000)
insert into borrow values(311,'sunil','dharampeth',3000)
insert into borrow values(321,'madhuri','andheri',2000)
insert into borrow values(375,'prmod','virar',8000)
insert into borrow values(481,'kranti','nehru place',3000)


/*2.1*/
1.	select * from deposit

2.	select * from borrow

3.	select * from customers

4.	select actno,cname,amount from deposit

5.	select loanno,amount from borrow

6.	select * from borrow where bname='andheri'

7.	select actno,amount from deposit where actno = 106

8.	Select cname from borrow where amount >5000

9.	select cname from deposit where adate >'1996-12-01'

10.	select cname from deposit where actno<105

11.	select cname from customers where city='nagpur' or city='delhi'
	select cname from customers where city in('nagpur','delhi')

12.	select cname,bname from deposit where amount>4000 and actno<105

13.	select cname from borrow where amount>=3000 and amount<=8000
	select cname from borrow where amount between 3000 and 8000

14.	select cname from deposit where bname!='andheri'
	select cname from deposit where bname<>'andheri'

15.	select cname from borrow where amount is null

16.	select actno,cname,amount from deposit where bname  in('ajni','karolbagh','m.g.road')

17.	select top 5 * from deposit

18.	select top 3 * from deposit where amount>1000

19.	select top 5 loanno,cname from borrow where bname<>'andheri'

20.	select distinct city from customers

21.	select distinct bname from branch 

22.	select * from customers order by city asc

23.	select * from deposit order by amount asc
	select * from deposit order by amount desc

24.	select * from customers order by city desc

25.	select  cname as uni_barrowers from borrow


/*2.2*/
1.  update deposit set amount=5000 where amount=3000

2.  update borrow set bname='c.g.road' where bname='vrce' and cname='anil'

3.  update deposit set actno=111,amount=5000 where cname='sandip'

4.  update borrow set amount=amount+(amount*.1)

5.  update deposit set amount=5000 where actno>103 and actno<107

6.  update borrow set amount = null where loanno=321 

7.  update borrow set bname='ajni', loanno=401 where loanno=201 and bname='c.g.road'

8.  update customers set cname='anil jain' where cname='anil'

9.  update deposit set cname='ramesh', amount=5500 ,bname='vrce' where actno=102

10. update borrow set bname=null , amount=null where loanno=481 and cname='kranti'


/*2.3*/
1.  delete from customers where city='bombay'

2.  delete from deposit where amount<1000

3.  delete from borrow where bname='ajni'

4.  delete from borrow where loanno>201 and loanno<210

5.  delete from deposit where adate>'1996-12-01'

6.  truncate table customers 

7.  delete from deposit where actno=101 and cname='anil'

8.  delete from deposit where bname<>'andheri'

9.  delete from borrow where amount<2000 and bname<>'vrce'

10. drop table branch