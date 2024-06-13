
public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		int l = 0 ; 
		int k = 7;
		int r = 0 ; 
		int sum = 0 ;
		int count = 0 ; 
		int max =999 ; 
		while(r<arr.length) {
			sum = sum + arr[r];
			  // System.out.println(" Sum -->"+sum+"index l -"+ l + " r -" + r);
			
			   
			   while(sum>=k) {
				   System.out.println("yaha ghata Sum -->"+ sum +" l -"+ l + " r -" + r);
				   sum = sum - arr[l];
				l++;
				count--;
				
                if(max>count) {
					max = count;
                    System.out.println(arr[l] + " " + arr[r] + " " + count);
				}
			}
			

			   if(sum <k ) {
				   System.out.println("yaha badha index sum  - "+sum +"  l-"+ l + " r -" + r);
				   count++;
					r++;
						
				}
			
		}
		 System.out.println("max bata do " + max);
	}

}
