import java.util.Scanner;
public class Gread {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("enter subject-1 mark = ");
            int a = scan.nextInt();
        System.out.println("enter subject-2 mark = ");
        int b = scan.nextInt();
        System.out.println("enter subject-3 mark = ");
        int c = scan.nextInt();
        System.out.println("enter subject-4 mark = ");
        int d = scan.nextInt();
        System.out.println("enter subject-5 mark = ");
        int e = scan.nextInt();

            float x=(a+b+c+d+e)/(5.0f);
        System.out.println("your parstiontag = "+x);
            if(x<40)
            {
                System.out.println("fail");
            }
            else if(x>=40 && x<50)
            {
                System.out.println("third division");
            }
            else if(x>49 && x<60)
            {
                 System.out.println("second division");
            }
            else if(x>59 && x<=100)
            {
                System.out.println("first division");
            }
            else
            {
                System.out.println("your mark is invalid");
            }

    }
}
