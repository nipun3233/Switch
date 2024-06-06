import java.util.Arrays;

public class isSubsequence {

	public static void main(String[] args) {
		String s = "b";
		String t = "abc";
	
		 int sp = 0;
	        int tp = 0;

	        while (sp < s.length() && tp < t.length()) {
	            if (s.charAt(sp) == t.charAt(tp)) {
	                sp++;
	            }
	            tp++;
	        }

	        System.out.println(sp == s.length());  
	}

}
