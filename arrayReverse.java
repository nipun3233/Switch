
public class arrayReverse {

	public static void main(String[] args) {
	int arr[] = new int[5];
	int j = 1;
	int m=0;
	int n=4;
	int temp;
	int count = 3;
	
	for (int i= 0;i<5;i++) {
		arr[i] = j;
		j++;
	}
	for (int i= 0;i<5;i++) {
		System.out.println(arr[i]);
		}
	
	
	while(count>0){
		temp = arr[m];
		arr[m]= arr[n];
		arr[n]= temp;
		m++;
		n--;
		count--;
	}
	
	for (int i= 0;i<5;i++) {
		System.out.println(arr[i]);
		}
	
	
	}

}
