public class Avg{
	public static void main(String[] args){
		int a[] = {18,631,175,416};
		double sum =0,avg;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("angrag = "+avg);
	}
}