interface in1{
    void prin();
    void switchoff();
}

interface in2 extends in1{
    void switchon();
}

interface in3{
    void goodmorning();
}

class in4 implements in2,in3 {
    public void switchoff(){
        System.out.println("swithchoff..");
    }
    public void prin(){
        System.out.println("hello...");
    }
    public void switchon(){
        System.out.println("swithchon..");
    }
    public void goodmorning(){
        System.out.println("goodmorning...");
    }
}

public class Interface{
    public static void main(String[] args) {
//        in1 obj1 = new in1();  ----> not allow interface object
        in4 obj2 = new in4();
        obj2.prin();
        obj2.switchoff();
        obj2.switchon();
        obj2.goodmorning();
    }
}
