import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int  a[]= new int[5],temp;
        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.printf("enter no%d : ",i+1);
            a[i] = input.nextInt();
        }

        for(int i=0;i<4;i++)
        {
            for (int j=i;j<4;j++)
            {
                if(a[i]>a[j+1])
                {
                    temp = a[i];
                    a[i]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
