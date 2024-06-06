
public class maxAndMin {

	public static void main(String[] args) {
	int arr[] = new int[] {6,3,2,1,5,0};
	int max=0;
	int min=1;
	
	for(int i=0;i<6;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println(min + " " + max);
	
	}

}
