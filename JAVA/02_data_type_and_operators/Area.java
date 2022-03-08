import java.util.Scanner;
public class Area{
	float circlearea(int R){
		float ans = (float)3.14*R*R;
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter r : ");
		int r = input.nextInt();

		Area obj1 = new Area(); 
		float area = obj1.circlearea(r);

		System.out.println("area of circle = "+area);
	}
}