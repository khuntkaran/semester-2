import java.util.Scanner;
class Matrix implements Runnable{
	public void run()
    {
    	Scanner input = new Scanner(System.in);
        int[][] a = new int[2][2];
        for(int i=0;i<2;i++){
        	for(int j=0;j<2;j++){
        		System.out.format("enter %d rom and %d column : ",(i+1),(j+1));
        		a[i][j]=input.nextInt();
        	}
        	
        }
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
        	System.out.println("sum : "+sum);
        }
    }
}

public class Matrix_Sum {
	public static void main(String[] args) {
		Matrix obj = new Matrix();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}