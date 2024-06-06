import java.util.Arrays;

public class removeDuplicatesInString {

	public static void main(String[] args) {
		String s3 = "aaaaagggggsssswwwwezzzzzzeebbbbxxxiiikkknnny";
		char arr[]= s3.toCharArray();
		Arrays.sort(arr);
		char temp ;
		int k=0;
		char arr2[] = new char[arr.length] ;
		for(int i = 1;i<arr.length;i++) {
			temp = arr[i-1];
			if(temp != arr[i]) {
				arr2[k]=temp;
				System.out.println(temp);
				k++;
			}
		}
		
		
		
		
		
	}

}
