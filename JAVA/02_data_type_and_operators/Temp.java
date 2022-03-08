import java.util.Scanner;
public class Temp{
	double ctof(double c){
		double f = (c*9/5)+32;
		return f;

	}
 	public static void main(String[] args){
 		Scanner input = new Scanner(System.in);

 		System.out.print("enter temprchar in celsius= ");
 		double c = input.nextDouble();

 		Temp obj1 = new Temp();

 		double t = obj1.ctof(c);

 		System.out.println("temprchar fahrenheit = " +t);
 	}
}