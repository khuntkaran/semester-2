import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Write_Read_In_Text_File {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("12_io_programming_advance/java.txt");
            byte[] out = "hiii hello\nhow are you\ni am fine".getBytes();
            fos.write(out);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("12_io_programming_advance/java.txt");
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
    }
}
