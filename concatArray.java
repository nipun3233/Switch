
public class concatArray {

	public static void main(String []args) {
		
		int[] arr= {1,2,3,4};
        int n= arr.length;
        int[]arr2 = new int[2*n];
        for (int i=0;i<=n-1;i++){
            arr2[i] = arr[i];
            arr2[n+i] = arr[i];
        }
        for (int i=0;i<arr2.length;i++) {
        	System.out.println(arr2[i]);
        }
	}
}
