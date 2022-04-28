 class MyEx extends Exception{
 	String str;
 	int a;
	MyEx(String s,int x){
		str =s;
		a=x;
	}
 	String display(){
 		return str;
 	}
 }
public class Raise{
	public static void main(String[] args) {
		int sum=0;
		
			for(int i=0;i<args.length;i++)
			{
				int flag=0;
				String st ="";
				try
				{
					int x = Integer.parseInt(args[i]);
					if(x<0){
						st+="given number is negative\n";
						flag=1;
					}
					if (x%10==0) {
						st+="given number is divied by 10\n";
						flag=1;
					}
					if (x>1000 && x<2000) {
						st+="given number is between 1000 and 2000\n";
						flag=1;
					}
					if (x>7000) {
						st+="given number is greater than 7000\n";
						flag=1;
					}
					if(flag==1){
						throw new MyEx(st,x);
					}
					else{
						sum+=x;
					}
				}
				catch(MyEx e) {
					System.out.println("error for "+e.a);
					System.out.println(e.display());
				}
			}
		System.out.println("sum = "+sum);
	}
}