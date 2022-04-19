class CollegeDemo{
    final String c = "CollegeDemo";
    String name = "College";
}
class EngineeringCollege extends CollegeDemo{
    String name = "Engineering Collage";

    void printDemo()
    {
        String name = "Computer Engineering Collage";
        System.out.println("only name : "+name);
        System.out.println("this name : "+this.name);
        System.out.println("super name : "+super.name);
        System.out.println("final name : "+c);
    }
}

public class College {
    public static void main(String[] args) {
        EngineeringCollege c = new EngineeringCollege();
        c.printDemo();
    }
}