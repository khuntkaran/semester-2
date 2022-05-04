import java.sql.Time;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Matrix implements Runnable{
	int[][] a = new int[2][2];
	void setmatrix(){
		Scanner input = new Scanner(System.in);

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.format("enter %d rom and %d column : ",(i+1),(j+1));
				a[i][j]=input.nextInt();
			}

		}
	}
	public void run()
    {

        for(int i=0;i<2;i++){
        	for(int j=0;j<2;j++){
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
        for(int i=0;i<2;i++){
        	int sum=0;
        	for(int j=0;j<2;j++){
        		sum=sum+a[i][j];
        	}
        	System.out.format("sum %d row : %d\n",(i+1),sum);
        }
    }
}

public class Matrix_Sum {
	public static void main(String[] args) throws InterruptedException {
		Matrix obj = new Matrix();
		obj.setmatrix();

		Instant start = Instant.now();

		Thread t1 = new Thread(obj);
		t1.start();
		t1.join();

		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

	}


}
