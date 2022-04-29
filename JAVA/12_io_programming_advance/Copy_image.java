import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy_image {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("12_io_programming_advance/4k.jpg");
            FileOutputStream fos = new FileOutputStream("12_io_programming_advance/4k3.jpg");
            int a = 0;
            a = fis.read();
            while (a!=-1){
                fos.write(a);
                a = fis.read();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("hello");
        }
    }
}
