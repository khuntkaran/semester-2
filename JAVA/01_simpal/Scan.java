import java.util.Scanner;
public class Scan {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("enter no1 : ");
            int c = input.nextInt();
            System.out.print("enter no2 : ");
            int a = input.nextInt();

            System.out.println("entered no1 = "+c);
            System.out.println("entered no2 = "+a);
        }

}
