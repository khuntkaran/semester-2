import java.util.Scanner;
class MyException extends Exception{
    int a;
    MyException(int a){
        this.a = a;
    }
    void withdraw(){
        System.out.format("your balance is less than %d",a);
    }
}
class Account{
    int a =5000;
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter withdraw balance : ");
        int b = sc.nextInt();
        try {
            if((a-b)>=0){
                System.out.println("withdraw successful...");
                a=a-b;
                System.out.println("your current balance : "+a);
            }
            else {
                throw new MyException(b);
            }
        }catch (MyException e){
            e.withdraw();
        }
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.withdraw();
    }
}
