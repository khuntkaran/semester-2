import java.util.Scanner;
class Mypoint{
    double x,y;

    Mypoint(){
        x=0;
        y=0;
    }
    Mypoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    double distance(Mypoint a){
        double k;
        return k= Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2));
    }
}

class Setxy{
    double x,y;
    Scanner input = new Scanner(System.in);

    public double getX(){
        System.out.print("Enter x : ");
        return x= input.nextDouble();
    }
    public double gety(){
        System.out.print("Enter y : ");
        return y= input.nextDouble();
    }
}

public class TwoDPointDemo{
    public static void main(String[] args){
        Setxy ab = new Setxy();
        Mypoint obj1 = new Mypoint();

        Mypoint obj2 = new Mypoint(ab.getX(), ab.gety());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ",obj1.x,obj1.y,obj2.x,obj2.y);
        System.out.println(obj1.distance(obj2));

        Mypoint obj3 = new Mypoint(ab.getX(), ab.gety());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ",obj2.x,obj2.y,obj3.x,obj3.y);
        System.out.println(obj2.distance(obj3));
    }
}