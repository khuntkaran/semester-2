class MyHeadPhone{
    static int stoke=5;
    void producer() {
        while (true) {
            stoke++;
            System.out.println("stoke = " + stoke);
            try {
                Thread.sleep(300);
                if (stoke > 5) {
                    Thread.sleep(800);
                }
            }catch(Exception e){}
        }
    }
    void consumer() {
        while (true) {
            stoke--;
            System.out.println("stoke = " + stoke);
            try {
                Thread.sleep(200);
                if (stoke < 1) {
                    Thread.sleep(1600);
                }
            }catch(Exception e){}
        }
    }
}
class MyProducer extends Thread{
    MyHeadPhone obj = new MyHeadPhone();
    public void run(){
        try {
            obj.producer();
        }catch (Exception e){
            System.out.println("hi");
        }
    }
}
class MyConsumer extends Thread{
    MyHeadPhone obj = new MyHeadPhone();
    public void run(){
        try {
            obj.consumer();
        }catch (Exception e){
            System.out.println("hi");
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        MyProducer obj1 = new MyProducer();
        MyConsumer obj2 = new MyConsumer();
        obj1.start();
        obj2.start();
    }
}