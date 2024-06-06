
public class stringReverse {

	public static void main(String[] args) {
		//Scanner sc = new Scanner
		
		String str = "nipuns";
		char temp ; 
		char arr[] = str.toCharArray();
		int j = arr.length-1 ;
		for(int i = 0 ; i <=(arr.length-1)/2;i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
