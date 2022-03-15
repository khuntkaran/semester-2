import java.util.Scanner;
class student
{
	int roll;
	String name;
	int age;
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
		// student s1 = new student();
		// s1.setdata(25,"karan",18);
		// s1.getdata();

		// student s2 = new student();
		// s2.setdata(26,"darshan",19);
		// s2.getdata();

		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		// student s3 = new student();
		// System.out.print("enter roll no :");
		// s3.roll = input.nextInt();
		// System.out.print("enter name:");
		// s3.name = sc.nextLine();
		// System.out.print("enter age :");
		// s3.age = input.nextInt();
		// s3.getdata();


		// student s3 = new student();
		// System.out.print("enter roll no :");
		// int roll = input.nextInt();
		// System.out.print("enter name :");
		// input.nextLine();
		// String name = input.nextLine();
		// System.out.print("enter age :");
		// int age = input.nextInt();
		// s3.setdata(roll,name,age);
		// s3.getdata();

		// student s3 = new student();
		// s3.setdata();
		// s3.getdata();

		// student s4 = new student();
		// s4.setdata();
		

		// student s5 = new student();
		// s5.setdata();
		// s5.getdata();
		// s4.getdata();

		student[] s = new student[3];

		for(int i =0;i<3;i++)
		{
			s[i].setdata();
		}

		for(int i =0;i<3;i++)
		{
			s[i].getdata();
		}
	}
}