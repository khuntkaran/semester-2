import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Replace{
	public static void main(String [] args) throws IOException {
		FileReader f1=new FileReader("10_io_programming_1/try.txt");
		BufferedReader bf=new BufferedReader(f1);
		FileWriter f2=new FileWriter("10_io_programming_1/tt.txt");
		String word1,word2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  word you want to replace: ");
		word1=sc.nextLine();
		System.out.println("Enter  word you want to replace with: ");
		word2=sc.nextLine();
		String x="",msg="";
		int y =0;
		while((x=bf.readLine())!=null) {
			String[] str = x.split(" ");
			for(String b : str){
				if(b.equals(word1)){
					y++;
				}
			}
			x=x.replace(word1,word2);
			f2.write(x);
			f2.write("\n");
		}
		f2.close();
		f1.close();
		System.out.println("no of replacement : "+y);
		
	}
}