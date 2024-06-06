
public class kthSmallestNumber {

	public static void main(String[] args) {
		int arr[] = new int[] {-3,2,-5,1,-7,7,4};
		int temp=0;
		int k =4;
		for (int i =0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("kth term "+  arr[k+1]);
	}

}
