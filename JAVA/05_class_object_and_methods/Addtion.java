import java.util.Scanner;
class AddDemo{
    public  AddDemo(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no1 : ");
        int i = input.nextInt();

        System.out.print("enter no2 : ");
        int j = input.nextInt();
        int c =i+j;
        System.out.println("sum = "+c);
    }
    public  AddDemo(int i,int j){
        int c =i+j;
        System.out.println("sum = "+c);
    }
}
public class Addtion {
    public static void main(String[] args) {

        AddDemo s = new AddDemo();

        Scanner input = new Scanner(System.in);
        System.out.print("enter no1 : ");
        int i = input.nextInt();
        System.out.print("enter no2 : ");
        int j = input.nextInt();
        AddDemo s2 = new AddDemo(i,j);
    }
}
