
public class recursion1PrintingNumber {
	
	public static void printerF(int [] n,int i) {
		int temp = 0;
		if(i==n.length-1) {
			//System.out.println(n);
			return;
			}
		if(n[i]>n[i+1]) {
			temp=n[i];
			n[i]=n[i+1];
			
		}
	//	printerF(n-1);
		//System.out.println(n);
	}
	
	public static void main(String[] args) {
		int []n= {5,2,3,1};
		//printerF(n);
	}
}
