import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number : ");
        int a = input.nextInt();
        int p=0;

        for (int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                System.out.print("number is not prime ");
                p+=1;
                break;
            }

        }
         if (p==0)
        {
            System.out.print("number is prime ");
        }
    }
}
