import java.util.*;
public class largestPostitveInteger {

	public static void main(String[] args) {
	
		int []nums = {-104,-449,-318,-930,-195,579,-410,822,-814,-388,-863,174,-814,919,-877,993,741,741,-623,-4,-4,542,997,239,447,-317,409,-487,-34,6,-914,607,-622,915,573,666,-229,165,841,-820,703};
		 Arrays.sort(nums);
		 int k = 0 ; 
		 while(k<nums.length) {
			// System.out.println(nums[k]);
			 k++;
		 }
	        int j = nums.length-1;
	        int i = 0 ;
	        while(i<j){
	            if(nums[i]==-nums[j]){
	                System.out.println(nums[j]);
	                break;
	            }
	            else if(nums[i]<(-nums[j])){
	            	  // System.out.println(nums[i] + "+ " + nums[j]);
	            	i++;
	            }
	            else if(nums[i]>(-nums[j])){
	            	 //  System.out.println(nums[i] + " -" + nums[j]);
	            	   j--;
	            	;
	            }
	        }
		
	        System.out.println("-1");
		
	}

}
