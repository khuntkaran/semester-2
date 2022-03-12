import java.util.Scanner;
public class Upper_case
{
    public static void main(String[] args)
    {
        // Scanner input = new Scanner(System.in);
        // System.out.println("enter string : ");
        // String ch = input.nextLine();

       for(int i=0;i<args[0].length();i++)
       {
           if (args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z')
           {
               System.out.println("character is capital its not valid");
               break;
           }


       }
    }
}
