import java.io.FileInputStream;
import java.io.FileOutputStream;

class Read_Image{
    FileInputStream fis3;
    Read_Image() {
        try {
            fis3 = new FileInputStream("12_io_programming_advance/4k4.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void read(int skip,int stl){
        try {
            int a=0;
            fis3.skip(skip);
            for (int i=0;i<stl;i++) {
                a = fis3.read();
                System.out.print((char) a);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
class Write_Image{
    FileInputStream fis;
    FileOutputStream fos;
    String name = "hello my name is karan";
    String name2 = "i am software engineer";
    String name3 = "i am study in darshan university";
    Write_Image() {
        try {
            fis = new FileInputStream("12_io_programming_advance/4k.jpg");
            fos = new FileOutputStream("12_io_programming_advance/4k4.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void write(String name,int z){
        try {
            for (int k = 0; k < name.length(); k++) {
                fos.write((char) name.charAt(k));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void writedemo(){
        try {

            int j=1;
            int a = 0;
            a = fis.read();
            while (a!=-1){
                fos.write(a);
                a = fis.read();
                if(j==79) {write(name,name.length());}
                if(j==179) {write(name2,name2.length());}
                if(j==235) {write(name3,name3.length());}
                j++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void readdemo(){
        System.out.println("message is");
        Read_Image ri = new Read_Image();
        ri.read(79,name.length());
        ri.read(100,name2.length());
        ri.read(56,name3.length());
    }
}
public class Write_Read_In_Image2 {
    public static void main(String[] args)  {
        Write_Image wr = new Write_Image();
        wr.writedemo();
        wr.readdemo();
    }
}