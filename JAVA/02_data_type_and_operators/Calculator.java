
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);

            System.out.print("enter no1 : ");
            int x=input.nextInt();
            System.out.print("enter no2 : ");
            int y=input.nextInt();

            System.out.println("sum=addtion of both number \nsub=subtrction of both number \nmul=multipiycation of both number \ndiv=divition of both number");
            System.out.print("enter desition : ");
            String a = scan.next();

            if(a=="sum")
            {
                int b=x+y;
                System.out.println("sum = "+b);
            }
            else if(a=="sub")
            {
                int b=x-y;
                System.out.println("subtrction = "+b);
            }
            else if(a=="mul")
            {
                int b=x*y;
                System.out.println("multiplication = "+b);
            }
            else if(a=="div")
            {
                int b=x/y;
                System.out.println("divition = "+b);
            }
            else
                System.out.println("envlid value");



        }
    }


