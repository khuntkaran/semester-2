abstract class Vegetable{
    String color;
    abstract public String toString();

}
class Potato extends Vegetable{
        public String toString(){
            color ="Potato -->  yellow";
            return color;
        }
}
class Brinjal extends Vegetable{
    public String toString(){
        color ="Brinjal  -->  purpal";
        return color;
    }
}
class Tomato extends Vegetable{
    public String toString(){
        color ="Tomato  -->  red";
        return color;
    }
}
public class VegetableDemo {
    public static void main(String[] args) {
        Potato obj1 = new Potato();
        Brinjal obj2 = new Brinjal();
        Tomato obj3 = new Tomato();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
