class Morning implements Runnable{
	public void run(){
		int p=1;
		while(p==1){
			System.out.println("Good Morning");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Afternoon implements Runnable{
	public void run(){
		int p=1;
		while(p==1){
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class Morning_Afternoon{
	public static void main(String[] args) {
		Afternoon af = new Afternoon();
		Morning mn = new Morning();
		Thread t1 = new Thread(mn);
		Thread t2 = new Thread(af);
		t1.start();
		t2.start();
	}
}