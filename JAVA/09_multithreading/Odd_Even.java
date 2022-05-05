class Odd implements Runnable{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){System.out.println("odd number : "+i);}
        }
    }
}
class Even implements Runnable{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){System.out.println("even number : "+i);}
        }
    }
}
public class Odd_Even {
    public static void main(String[] args) {
        Odd od = new Odd();
        Even ev = new Even();
        Thread t1 = new Thread(od);
        Thread t2 = new Thread(ev);
        t1.start();
        t2.start();
    }
}