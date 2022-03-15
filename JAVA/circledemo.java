// import java.util.Scanner;
// class circle
// {

// 	double areaofcircle(double r)
// 	{
// 		return 3.14*r*r;
// 	}
// }
// class circledemo
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner input = new Scanner(System.in);
// 		System.out.print("enter radius : ");
// 		double r = input.nextDouble();

// 		circle c1 = new circle();

// 		double area = c1.areaofcircle(r);
// 		System.out.println("area = "+area);

// 	}
// }

import java.util.Scanner;
class circle
{
	double r;
	double areaofcircle()
	{
		return 3.14*r*r;
	}
}
class circledemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter radius : ");
		circle c1 = new circle();
		 c1.r = input.nextDouble();

		

		double area = c1.areaofcircle();
		System.out.println("area = "+area);

	}
}