interface A{
    int A_constant = 5;
    void A_methode();
}
interface A1 extends A{
    int A1_constant = 6;
    void A1_methode();
}
interface A2 extends A{
    int A2_constant = 7;
    void A2_methode();
}
interface A12 extends A1,A2{
    int A12_constant = 8;
    void A12_methode();
}
class B implements A12{

    @Override
    public  void A_methode() {
        System.out.println("hii i am A-methode and this my constant --> "+A_constant);
    }

    @Override
    public  void A1_methode() {
        System.out.println("hii i am A1-methode and this my constant --> "+A1_constant);
    }

    @Override
    public void A2_methode() {
        System.out.println("hii i am A2-methode and this my constant --> "+A2_constant);
    }

    @Override
    public void A12_methode() {
        System.out.println("hii i am A12-methode and this my constant --> "+A12_constant);
    }
}
public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.A_methode();
        obj.A1_methode();
        obj.A2_methode();
        obj.A12_methode();
    }
}
