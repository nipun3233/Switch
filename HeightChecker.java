import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int []height = {1,1,4,2,1,3};
		int []expected = new int[height.length];
		int count = 0 ; 
		
		//System.out.println(expected[2]);
		for(int i = 0 ; i<height.length;i++) {
			expected[i] = height[i];		
		}
		Arrays.sort(expected);
		
		
		for(int i = 0 ; i<height.length;i++) {
			System.out.println(height[i] + " " + expected[i]);
			
			if(height[i]!=expected[i]) {
				count ++;
			}
		}
	
	System.out.println(count);
	
	}

}
