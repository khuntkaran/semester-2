
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
class Matrix implements Runnable{

	int y,m,n;
	int[][] a ;

	int setmatrix(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter row : ");
		m = input.nextInt();
		System.out.println("enter column : ");
		n = input.nextInt();
		a=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.format("enter %d rom and %d column : ",(i+1),(j+1));
				a[i][j]=input.nextInt();
			}

		}
		return m;
	}
	void printmatrix(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void run()
    {
        	int sum=0;
        	for(int j=0;j<n;j++){
        		sum=sum+a[y][j];
        	}
        	System.out.format("sum %d row : %d\n",(y+1),sum);
    }
}

public class Matrix_Sum {
	public static void main(String[] args) throws InterruptedException {
		Matrix obj = new Matrix();
		int x =obj.setmatrix();

		Instant start = Instant.now();

		obj.printmatrix();

//		Thread t1 = new Thread(obj);
//		t1.start();
//		t1.join();

		Thread t[]=new Thread[x];
		for (int i =0;i<x;i++){
			obj.y =i;
			t[i]=new Thread(obj);
			t[i].start();
			t[i].join();
		}

		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

	}
}