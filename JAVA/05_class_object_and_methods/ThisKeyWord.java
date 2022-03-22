class Count2
{
    static int i=5;
     Count2(int i){
        this.i=i;
    }
    void print(){
        System.out.println("i = "+i);
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        int i=0;
        Count2 c = new Count2(i);
        c.print();
    }
}
