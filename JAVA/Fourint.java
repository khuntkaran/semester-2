import java.util.Scanner;
public class Fourint{
	public static void main(String[] args){
		int[] a= new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<4;i++){
		System.out.printf("enter %d values : ",i+1);
		  a[i]= sc.nextInt();
		}
		
		int sum =0;
		// for (int i=0;i<4;i++){
		// 	sum +=a[i];
		// }
		for (int i:a){
			sum +=i;
		}
		double avg = sum/4.0;
		System.out.println("avg of given values : "+avg);

	}
}