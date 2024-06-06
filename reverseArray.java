class formula{
	
	void rev(int [] a){
	int a1[]= a;
	for (int i= (a1.length-1) ; i>=0;i--) {
		System.out.println(a1[i]);
	}	
	}
	void rev2(int [] a) {
		int a1[]=a;
		int j=a1[0];
		int k =a1[a1.length-1];
		int l ;
		for (int i = 0;i<(a1.length/2);i++) {
			l =k;
			j=k;
			k=j;
		}
		for (int i= (a1.length-1) ; i>=0;i--) {
			System.out.println(a1[i]);
		}
	}
}

public class reverseArray {

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5,2,7};
		formula ob1 = new formula();
		//ob1.rev(arr);
		ob1.rev2(arr);
	}	
}

