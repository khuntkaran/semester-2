import java.io.FileInputStream;

public class CountFile {
    public static void main(String[] args) {
        int linecount = 0;
        int charcount = 0;
        int wordcount = 0;
        try {
            FileInputStream fis = new FileInputStream("10_io_programming_1/java.txt");
            int a = 0;
            a = fis.read();
            while (a != -1) {
                if (a == 32) {
                    wordcount++;
                    charcount--;
                }
                else if (a == 10) {
                    wordcount++;
                    linecount++;
                    charcount--;
                }
                charcount++;
                a = fis.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hello");
        }
        wordcount++;
        linecount++;
        System.out.println("charter = "+charcount);
        System.out.println("word = "+wordcount);
        System.out.println("line = "+linecount);
    }
}
