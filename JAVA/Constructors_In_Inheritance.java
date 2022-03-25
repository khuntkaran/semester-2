class Base{
    Base()
    {
        System.out.println("This is a base class ");
    }
    Base(int i)
    {
        System.out.println("This is a base class with argument");
    }
}
class Derived extends Base{
    Derived()
    {
        super(0);
        System.out.println("This is a Derived class ");
    }
    Derived(int i)
    {
        System.out.println("This is a Derived class with argument");
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("===========================================");
        Derived d1 = new Derived(1);
    }
}
