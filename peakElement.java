
public class peakElement {

	public static void main(String[] args) {
		int arr[] = {10,20,15,2,23,90,67};
		int result=0;
		for(int i =1;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]) {
				result = arr[i];
			}
		}
		System.out.println(result);
 	}

}
