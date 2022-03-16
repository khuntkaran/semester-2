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

		System.out.println("area of circle = "+c1.areaofcircle());

	}
}