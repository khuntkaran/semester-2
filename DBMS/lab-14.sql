	begin
	declare @i int
	set @i = 1
	while @i<=10
	begin
	print @i
	set @i=@i+1
	end
	end


1.	create function print1to10()
	returns varchar(100)
	as
	begin
		declare @i int , @demo varchar(100)
		set @i = 1
		set @demo=''
		while @i<=10
		begin
			select @demo = @demo+cast(@i as varchar(10))+','
			set @i=@i+1
		end
		return @demo
	end

	select dbo.print1to10()


2.	create function oddeven(@num int)
	returns varchar(10)
	as
	begin
		declare @demo varchar(100)
		if @num%2=0
		begin
			set @demo='even'
		end
		else
		begin
			set @demo= 'odd'
		end
		return @demo 
	end

	select dbo.oddeven(12)


3.	create function odd1to10()
	returns varchar(100)
	as
	begin
		declare @i int , @demo varchar(100)
		set @i = 1
		set @demo=''
		while @i<=10
		begin
			if @i%2 !=0
			begin
				select @demo = @demo+cast(@i as varchar(10))+','
			end
			set @i=@i+1
		end
		return @demo
	end

	select dbo.odd1to10()


4.	create function sum50()
	returns int
	as
	begin
		declare @i int ,@sum int
		set @i = 1
		set @sum=0
		while @i<=50
		begin
			set @sum=@sum+@i
			set @i=@i+1
		end
		return @sum
	end

	select dbo.sum50()


5.	create function even20()
	returns int
	as
	begin
		declare @i int ,@sum int
		set @i = 1
		set @sum=0
		while @i<=20
		begin
			if @i%2 =0
			begin
				set @sum=@sum+@i
			end
			set @i=@i+1
		end
		return @sum
	end

	select dbo.even20()


6.	create function prime(@num int)
	returns varchar(10)
	as
	begin
		declare @demo varchar(10),@i int =2
		while @i<@num
		begin
			if @num%@i=0
			begin
				set @demo='not prime'
				break
			end
			else
			begin
				set @demo= 'prime'
			end
			set @i=@i+1
		end
		return @demo 
	end

	select dbo.prime(9)


7.	create function oddeventable
	returns 
	as


