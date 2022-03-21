import java.util.Scanner;

public class Addition2 {

        public static void main(String[] args) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float c = a + b;
            System.out.println("simpal.Addition : " + c);

            Scanner input = new Scanner(System.in);
            System.out.print("enter no1 : ");
             b = input.nextInt();
            System.out.print("enter no2 : ");
            a = input.nextInt();
            c=a+b;
            System.out.println("simpal.Addition : " + c);
        }
}