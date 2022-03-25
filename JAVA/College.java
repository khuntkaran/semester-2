class CollegeDemo{
    String name = "CollegeDemo";
}
class EngineeringCollege extends CollegeDemo{
    String name = "EngineeringCollage";
    void printDemo()
    {
        String name = "PrintDemo";
        System.out.println("only name : "+name);
        System.out.println("this name : "+this.name);
        System.out.println("super name : "+super.name);
    }
}

public class College {
    public static void main(String[] args) {
        EngineeringCollege c = new EngineeringCollege();
        c.printDemo();
    }
}
