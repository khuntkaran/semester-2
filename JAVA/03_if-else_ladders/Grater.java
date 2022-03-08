import java.util.Scanner;
public class Grater{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter no1 : ");
		 int a =input.nextInt();
		 System.out.print("enter no2 : ");
		 int b =input.nextInt();
		 System.out.print("enter no3 : ");
		 int c = input.nextInt();

		 if(a>b)
		 {
		 	if(c>a)
		 	{
		 		System.out.println("no3 is big");
		 	}
		 	else
		 	{
		 		System.out.println("no1 is big");
		 	}
			
		 }
		 else
		 {
		 	if(c>b)
		 	{
		 		System.out.println("no3 is big");
		 	}
		 	else
		 	{
		 		System.out.println("no2 is big");
		 	}
		 }



	}
}