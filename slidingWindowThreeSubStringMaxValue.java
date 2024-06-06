
public class slidingWindowThreeSubStringMaxValue {

	public static void main(String[] args) {
		int [] arr = {2,3,5,2,9,7,1,3,2,1,5,7,3,9,7,0,1};
		int sum = arr[0]+arr[1]+arr[2]; 
		int res = 0 ;
		
		for(int i = 1 ; i<arr.length-2;i++) {
			sum = sum - arr[i-1]+arr[i+2];
			if(sum >res) {
				System.out.println(arr[i]+" " +arr[i+1]+ " "+ arr[i+2]+" "+ sum );
				res = sum;
			}
		}
		System.out.println(res);
	}

}










