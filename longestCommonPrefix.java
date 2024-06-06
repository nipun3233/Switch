
public class longestCommonPrefix {

	public static void main(String[] args) {
		String []arr = {"flower","flow","flight"};
		int st = 0;
		char temp = 0 ;
		String res = "";

		for(int i = 0 ;i<arr[0].length();i++) {
			
			temp = arr[0].charAt(i);
			
			for(int j = 0 ;j<arr.length;j++) {
				if(arr[j].charAt(i)!=temp)
					st = 1;
					break;
			}
			if(st == 1)
				break;
			res = res+temp;
			System.out.println(res);
		}
		System.out.println(res);
		
	}

}
