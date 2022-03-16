import java.util.Scanner;

class student
{
	static int i=1;
	int roll;
	String name;
	int age;

	void setdata(int roll,String name,int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}


	void setdata()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("enter roll no :");
		roll = input.nextInt();
		System.out.print("enter name :");
		input.nextLine();
		name = input.nextLine();
		System.out.print("enter age :");
		age = input.nextInt();
	}
	void getdata()
	{
		System.out.printf("student-%d details\n",i++);

		System.out.println("roll no : "+roll);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("============================");
	}
}

class Studentdemo
{

	public static void main(String[] args)
	{
		 student s1 = new student();
		 s1.setdata(25,"karan",18);
		 s1.getdata();

		 student s2 = new student();
		 s2.setdata(26,"darshan",19);
		 s2.getdata();

		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);


		student s3 = new student();
		System.out.print("enter roll no :");
		int roll = input.nextInt();
		System.out.print("enter name :");
		input.nextLine();		// scan int and after scan string way-2 with one scanner object
		String name = input.nextLine();
		System.out.print("enter age :");
		int age = input.nextInt();
		s3.setdata(roll,name,age);
		s3.getdata();

		//===================================================


		student s4 = new student();
		System.out.print("enter roll no :");
		s4.roll = input.nextInt();
		System.out.print("enter name:");
		s4.name = sc.nextLine();// scan int and after scan string way-1 with two scanner object
		System.out.print("enter age :");
		s4.age = input.nextInt();
		s4.getdata();


		//===================================================


		 student s5 = new student();
		 s5.setdata();
		 s5.getdata();

		 student s6 = new student();
		 s6.setdata();
		 s6.getdata();
		

		//===================================================

	}
}