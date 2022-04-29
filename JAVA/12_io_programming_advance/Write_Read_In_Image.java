import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Write_Read_In_Image {
    public static void main(String[] args){
        int j=1;
        String name = "hello my name is karan";
        String name2 = "i am software engeneer";
      
        try {
            FileInputStream fis = new FileInputStream("12_io_programming_advance/4k.jpg");
            FileOutputStream fos = new FileOutputStream("12_io_programming_advance/4k4.jpg");
            int a = 0;
            a = fis.read();
            while (a!=-1){
                fos.write(a);
                a = fis.read();
                if(j==79) {
                    for (int k = 0; k < name.length(); k++) {
                        fos.write((char) name.charAt(k));
                    }
                }
                if(j==179) {
                    for (int k = 0; k <name2.length(); k++) {
                        fos.write((char) name2.charAt(k));
                    }
                }
                j++;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("hello");
        }

        System.out.println("message is");
        try {
            FileInputStream fis2 = new FileInputStream("12_io_programming_advance/4k4.jpg");
            int a=0;
            fis2.skip(79);
            a = fis2.read();
            for (int i=0;i<name.length();i++) {
                System.out.print((char) a);
                a = fis2.read();
            }
            System.out.println("");
            fis2.skip(99);
            a = fis2.read();
            for (int i=0;i<name2.length();i++) {
                System.out.print((char) a);
                a = fis2.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}