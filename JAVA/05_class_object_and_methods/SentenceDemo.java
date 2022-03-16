import java.util.Scanner;

class sentence {
        void sen()
        {
            System.out.println("enter string");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            if(name.equalsIgnoreCase("quit")){ }
            else {
                sentence s1 = new sentence();
                System.out.println("entered string in presented vowel = "+s1.vowel(name));
                s1.sen();
            }
        }
        int vowel(String n)
        {
            n = n.toLowerCase();
            int a=0;
            for(int i=0;i<n.length();i++) {
                char ch = n.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') a++;
            }
            return a;
        }
    }

public class SentenceDemo {
    public static void main(String[] args) {
        sentence s2 = new sentence();
        s2.sen();
    }
}