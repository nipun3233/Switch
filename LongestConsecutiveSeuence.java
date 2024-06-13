import java.util.Arrays;

public class LongestConsecutiveSeuence {

	public static void main(String[] args) {
		int []nums = {100,4,200,5,6,9,1,3,2};
		Arrays.sort(nums);
		int count = 0  ;  
		int max = 0 ; 
		for(int i = 0 ; i <nums.length;i++) {
			System.out.println(nums[i]);
		}
		for(int i = 0 ; i<nums.length-1;i++) {
			if(nums[i]+1 == nums[i+1]) {
				count++;
				if(count > max) max = count;
			}
			else {
				count = 0 ; 
			}
		}
		System.out.println(max+1);
		
	}
}
