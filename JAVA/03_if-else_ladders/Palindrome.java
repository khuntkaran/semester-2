import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = input.nextInt(),x=0;

        for(int i = a ; i>0;)
        {
            x=(x*10)+(i%10);
            i=i/10;
        }
        if (a==x)
        {
            System.out.print("number is palindrome");
        }
       else
        {
            System.out.print("number is not palindrome");
        }

    }
}
