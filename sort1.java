
public class sort1 {

	public static void main(String[] args) {
		int arr[] = {0,1,1,2,1,0,0,1,0,2};
		test ob = new test();
		int storage[]= ob.sort(arr);
		
		for(int i =0;i<storage.length;i++) {
			System.out.println(storage[i]);
		}
	}

}

class test{
	
	int[] sort(int[] a) {
		int arr[] = a;
		int temp;
		for(int i =0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				//System.out.println(arr[i]);
				}
			}
		}
		
		return a;
	}
}
