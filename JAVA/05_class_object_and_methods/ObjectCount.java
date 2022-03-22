class Count
{
    static int i=0;
    Count(){
        i++;

    }
    void print(){
        System.out.println("Object = "+i);
    }
}

public class ObjectCount {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        Count c4 = new Count();
        Count c5 = new Count();
        c5.print();
    }
}
