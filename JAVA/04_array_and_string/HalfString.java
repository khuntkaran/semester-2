import java.util.Scanner;
public class HalfString {
    public static void main(String[] args) {

        System.out.println("enter string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();


        int i = str.length()/2;
        System.out.println("your string is = "+str.substring(i));
    }
}
