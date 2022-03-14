select 5*30

select abs(-25),abs(25),abs(-50),abs(50)

select CEILING(25.2),ceiling(25.7),CEILING(-25.2)

select Floor(25.2),Floor(25.7),Floor(-25.2)

select 5%2,5%3

select POWER(3,2),POWER(4,3)

select SQRT(25),SQRT(30),SQRT(50)

select SQUARE(5),SQUARE(15),SQUARE(25)

select pi()

select ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)

select EXP(2),EXP(3)

select log10(5),LOG10(100)

select sin(3.1415),cos(3.1415),tan(3.1415)

select sign(-25),sign(0),sign(25)

select RAND()





select len(null),len('hello'),len('')

select LOWER('KAran'),UPPER('karan')

select SUBSTRING('darshan university',1,3)

select SUBSTRING('darshan university',3,8)

select REPLACE('abc123efg',123,'xyz'),REPLACE('abcabcabc','c',5)

select ascii('a'),ascii('A'),ascii('z'),ascii('Z'),ascii(0),ascii(9)

select char(97),char(65),char(122),char(90),char(48),char(57)

select LTRIM('     du       ')

select RTRIM('     du       ')

select LEFT('sql server',4),right('sql server',5)

select cast('1234.56' as float)

select convert(int,10.58)

select SPACE(10)+'karan'+space(15)

select 'khunt'+'karan'
select concat('khunt','karan')

select REVERSE('karan')



select coalesce(null,null,'a+',null,'c')
select ISNUMERIC('a')

