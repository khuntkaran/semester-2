import java.util.Scanner;
class ThreeDPoint{
    double x,y,z;

    ThreeDPoint(){
        x=0;
        y=0;
        z=0;
    }
    ThreeDPoint(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    double distance(ThreeDPoint a){
        double k;
        return k= Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2)+Math.pow(this.z-a.z,2));
    }
}

class Setxyz{
    double x,y,z;
    Scanner input = new Scanner(System.in);

    public double getX(){
        System.out.print("Enter x : ");
        return x= input.nextDouble();
    }
    public double gety(){
        System.out.print("Enter y : ");
        return y= input.nextDouble();
    }
    public double getz(){
        System.out.print("Enter z : ");
        return z= input.nextDouble();
    }
}
public class ThreeDPointDemo{
    public static void main(String[] args){
        Setxyz ab = new Setxyz();
        ThreeDPoint obj1 = new ThreeDPoint();

        ThreeDPoint obj2 = new ThreeDPoint(ab.getX(), ab.gety(),ab.getz());
        System.out.printf("distance (%.1f,%.1f,%.1f) to (%.1f,%.1f,%.1f) : ",obj1.x,obj1.y,obj1.z,obj2.x,obj2.y,obj2.z);
        System.out.println(obj1.distance(obj2));

        ThreeDPoint obj3 = new ThreeDPoint(ab.getX(), ab.gety(),ab.getz());
        System.out.printf("distance (%.1f,%.1f,%.1f) to (%.1f,%.1f,%.1f) : ",obj2.x,obj2.y,obj2.z,obj3.x,obj3.y,obj3.z);
        System.out.println(obj2.distance(obj3));
    }
}