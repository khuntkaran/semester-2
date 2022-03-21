import java.util.Scanner;
public class Patten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no1 : ");
        int a = input.nextInt();

        for (int i=0;i<a;i++)
        {
            for(int k=i+1;k<a;k++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=a-1;i>0;i--)
        {
            for(int k=i;k<a;k++)
            {
                System.out.print(" ");
            }
            for (int j=i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
