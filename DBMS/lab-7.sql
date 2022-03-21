1.  select getdate() as today_date

2.  select getdate() + 365

3.  select convert(varchar,getdate())		//Mar 21 2022  4:55PM

4.  select convert(varchar,getdate(),106)	//21 Mar 2022
	select convert(varchar,getdate(),6)		//21 Mar 22

5.  select convert(varchar,getdate(),107)	//Mar 21, 2022
	select convert(varchar,getdate(),7)		//Mar 21, 22

6.  select DATEDIFF(month,'2008-12-31','2009-03-31')

7.  select DATEDIFF(year,'25-jan-12','14-sep-10')

8.  select DATEDIFF(hour,'2012-01-25 07:00','2012-01-26 10:30')

9.  select day('2016-05-12'),month('2016-05-12'),year('2016-05-12')

10. select dateadd(year,5,GETDATE())

11. select dateadd(MONTH,-2,GETDATE())

12. select datename(month,getdate())	//March
	select datepart(month,getdate())	//3

13. select EOMONTH(getdate())

14. select dateadd(DAY,30,GETDATE())
	select getdate() + 30

15. select DATEDIFF(month,'2004-07-16',GETDATE())
	select DATEDIFF(year,'2004-07-16',GETDATE())