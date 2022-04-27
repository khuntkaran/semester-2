public class ComputingXY{
	public static void main(String[] args) {
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("answer = "+(x*y));
		}catch(Exception e){
			System.out.println("envild value");
		}
		System.out.println("hello...");
	}
}