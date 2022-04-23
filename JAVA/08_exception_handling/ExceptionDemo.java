import java.util.Scanner;
class ExceptionDemo2{
    void throwdemo(int a,int b) {
        if(b==0){
            try {
                throw new Exception("not divied ");
            }catch (Exception e) {
                System.out.println("not divied by 0");
            }

        }
        else {
            System.out.println("devistion : "+a/b);
        }
    }
}
public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value");
        int a=input.nextInt();
        System.out.println("enter value");
        int b=input.nextInt();
        int c;
        try {
            c=a/b;
            System.out.println("devistion in main : "+c);
        }catch (Exception e){
            System.out.println("data not found");
        }



        ExceptionDemo2 ED21 = new ExceptionDemo2();
        ED21.throwdemo(a,b);



        for (int i=0;i<10;i++)
        {
            try{
                if(i==5){
                    break;
                }
            }catch (Exception e){

            }
            finally{
                System.out.println("i am exsicute "+i+"times");
            }
        }
    }
}
