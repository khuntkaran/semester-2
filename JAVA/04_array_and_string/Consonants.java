import java.util.Scanner;
public class Consonants{
	public static void main(String[] args){
		System.out.print("enter string : ");
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= s1.toLowerCase();
		int v=0,c=0;

		for(int i=0;i<s2.length();i++){
			char ch = s2.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			
				v++;
			}
			else{
				 c++;
			}
		}


		System.out.println("vovels in string : "+v);
		System.out.println("Consonants in string : "+c);
	}
}