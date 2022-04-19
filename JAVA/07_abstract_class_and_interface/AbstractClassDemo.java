abstract class Ab1{
    void prin(){
        System.out.println("hello...");
    }
    abstract void switchoff();
}

class Ab2 extends Ab1{
    void switchoff(){
        System.out.println("swithchoff..");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
//        Ab1 obj1 = new Ab1() ;  ----> not allow abstract class object
        Ab2 obj2 = new Ab2() ;
        obj2.prin();
        obj2.switchoff();

    }
}
