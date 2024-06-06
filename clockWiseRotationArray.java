
public class clockWiseRotationArray {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6};
		int arr2[] = new int[arr.length+1];
		int temp = arr[arr.length-1];
		
		for(int i =0;i<arr.length;i++) {
			arr2[i+1] = arr[i];
		}
		arr2[0] = temp;
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
 	}

}
