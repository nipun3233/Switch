
public class subArraySum {

	public static void main(String[] args) {
		int [] arr = {1,2,3,2,1,3,2};
		int k = 3;
		int count=0;
		for(int i = 0;i<arr.length;i++) {
			//System.out.println("/n  ");
			int sum =0;
			for (int j = i ;j<arr.length;j++) {
				//System.out.println(arr[i]+" "+arr[j]+"  "+sum);
				if(sum ==k )
				count ++;
				sum = sum +arr[j];
				
			}
		}
	
	System.out.println(count);
	}

}
