/*math functions*/

1.  select 5*30

2.  select abs(-25),abs(25),abs(-50),abs(50)

3.  select CEILING(25.2),ceiling(25.7),CEILING(-25.2)

4.  select Floor(25.2),Floor(25.7),Floor(-25.2)

5.  select 5%2,5%3

6.  select POWER(3,2),POWER(4,3)

7.  select SQRT(25),SQRT(30),SQRT(50)

8.  select SQUARE(5),SQUARE(15),SQUARE(25)

9.  select pi()

10. select ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)

11. select EXP(2),EXP(3)

12. select log10(5),LOG10(100)

13. select sin(3.1415),cos(3.1415),tan(3.1415)

14. select sign(-25),sign(0),sign(25)

15. select RAND()



/*string functions*/

1.  select len(null),len('hello'),len('')

2.  select LOWER('KAran'),UPPER('karan')

3.  select SUBSTRING('darshan university',1,3)

4.  select SUBSTRING('darshan university',3,8)

5.  select REPLACE('abc123efg',123,'xyz'),REPLACE('abcabcabc','c',5)

6.  select ascii('a'),ascii('A'),ascii('z'),ascii('Z'),ascii(0),ascii(9)

7.  select char(97),char(65),char(122),char(90),char(48),char(57)

8.  select LTRIM('     du       ')

9.  select RTRIM('     du       ')

10. select LEFT('sql server',4),right('sql server',5)

11. select cast('1234.56' as float)

12. select convert(int,10.58)

13. select SPACE(10)+'karan'+space(15)

14. select 'khunt'+'karan'
    select concat('khunt','karan')

15. select REVERSE('karan')

16. select REPLICATE('karan',5)

17. select STUFF('sql tutorial',1,3,'html')

18. select coalesce(null,null,'a+',null,'c')

19. select ISNUMERIC('a')

20. select charindex('t','costomer')

