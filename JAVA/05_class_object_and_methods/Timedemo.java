import java.util.Scanner;

class Time
{
    static int hour,min,sec;

    Time(int h, int m, int s)
    {
        sec=sec+s;
        while(sec>60) {
            min++;
            sec -=60;
        }

        min=min+m;
        while(min>60) {
            hour++;
            min -=60;
        }

        hour=hour+h;

        System.out.println("your hours : "+hour+"\nyour minite : "+min+"\nyour second : "+sec);
    }

    void time()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter adding hour : ");
        int a = input.nextInt();
        System.out.print("enter adding minite : ");
        int b = input.nextInt();
        System.out.print("enter adding second : ");
        int c = input.nextInt();

        Time t2 = new Time(a,b,c);
    }
}


public class Timedemo {
    public static void main(String[] args) {
        Time t1 = new Time(2,50,30);
        t1.time();
    }
}
