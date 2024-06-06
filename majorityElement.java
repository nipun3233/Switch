import java.util.*;
public class majorityElement {

	public static void main(String[] args) {
		int []nums = {3,2,3}; 
		int freq = 0;
        int result= 0;
        int opt = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1;i++){
        	
        	if(nums[i]==nums[i+1]) {
        		freq=freq +1;
        	}
        	else {
        		freq =0;
        	}
        	
        	if(result < freq ) {
        		result = freq;
        		opt = nums[i];
        	}
        }
        
        System.out.println(opt + " "+  result);
		
	}

}
