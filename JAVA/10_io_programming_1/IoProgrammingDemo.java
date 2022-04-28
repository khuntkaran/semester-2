import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoProgrammingDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("10_io_programming_1/IoProgrammingDemo.java");
            int a = 0;
            a = fis.read();
            while (a!=-1){
                System.out.print((char) a);
                a = fis.read();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("hello");
        }

        try {
            FileOutputStream fos = new FileOutputStream("10_io_programming_1/java.txt");
            byte[] out = "hiii hello\nhow are you\ni am fine".getBytes();
            fos.write(out);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
