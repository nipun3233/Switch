import java.util.HashMap;

public class slidinWindowLongestSubstringWithoutRepetation {

	public static void main(String[] args) {
		//char [] arr = {'a','b','c','b','c','a','d','e','f','e','f','d'};
		String s = "abcbc";
		
		HashMap<Character, Integer> map = new HashMap<>();
		int j = 0 ;
		int res = 0 ;
		int i = 0 ;
		int count = 0;
		
		
		
		while(j<s.length()) {
			
			if(map.containsKey( s.charAt(j))) {
				i = map.get(s.charAt(j));
				count = j-i+1;
				map.put(s.charAt(j), j);
				if(count>res) {
					res = count;
					System.out.println(s.charAt(i)+" " + s.charAt(j));
				}
				j++;
				}
			
			else {
					map.put(s.charAt(j), j);
					j++;
					
			}
	
		}
		if(i==j) {
			return 1;
		}
		System.out.println(res);	
		
		System.out.println(map);
		
	}

}
