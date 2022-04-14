import java.util.*;

class Check {
    int Check2() {
        Random x = new Random();
        int number = x.nextInt(100);
        return number;
    }
}

class Result
{
    int number,i=0;
    Result() {
        Check c = new Check();
         number = c.Check2();
        checknumber();
    }
    void checknumber()
    {
        System.out.print("guess number : ");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();

        if(number>b){
            System.out.println("number is small choose big number");
            i++;
            checknumber();
        }
        else if(number<b){
            System.out.println("number is big choose small number");
            i++;
            checknumber();
        }
        else{
            System.out.format("your number %d is correct\n",b);
            System.out.format("Computer generated number is %d\n",number);
            System.out.printf("you are %d time guess number",i+1);
        }
    }
}

public class Rndom_number {
    public static void main(String[] args) {
        Result p = new Result();
    }
}