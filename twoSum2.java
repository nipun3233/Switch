import java.util.HashMap;
import java.util.Map.Entry;

public class twoSum2 {

	public static void main(String[] args) {
		int []nums = {2,7,11,15};
		int k = 9 ; 
		int temp = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i <nums.length;i++) {
			map.put(nums[i],i);
		}
		System.out.println(map);
		
		
		
		
		System.out.println(((Object) map).getKey(7));
		
		
		
		
//		for(int i = 0 ; i <nums.length;i++) {
//			temp = k - nums[i];
//			if(map.containsValue(temp)) {
//				System.out.println(i+"true" +  map.containsKey(temp));
//			}
//		}
		
	}

}
