
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double b;
            System.out.print("enter no1 : ");
            int x=input.nextInt();
            System.out.print("enter no2 : ");
            int y=input.nextInt();

            System.out.println("sum = addtion of both number \nsub = subtrction of both number \nmul = multipiycation of both number \ndiv = divition of both number");

            System.out.print("enter desition : ");
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();

            System.out.println(a);

            if(a.equals("sum")) {
                b = x + y;
                System.out.println("sum = " + b);
            }
            else if(a.equals("sub")){
                b=x-y;
                System.out.println("subtrction = "+b);
            }
            else if(a.equals("mul")){
                 b=x*y;
                System.out.println("multiplication = "+b);
            }
            else if(a.equals("div")){
                b=x/y;
                System.out.println("divition = "+b);
            }
            else {
                System.out.println("envlid value");
            }
        }
    }