
public class minMaxElement {

	public static void main(String[] args) {
		int arr[] = {1,423,6,46,34,-1,23,13,53,4};
		int min = arr[0];
		int max = arr[0];
		
		for(int i =0 ; i<arr.length;i++) {
			if (arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min + " " + max);
	}

}
