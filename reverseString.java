
public class reverseString {

	public static void main(String[] args) {
		char c[] = {'N','I','P','U','N'};
		String s = new String(c);
		char temp;
		String s2 = "";
		
		for(int i=0;i<s.length();i++) {
			temp = s.charAt(i);
			s2=temp +s2;
		}
		
			System.out.println(s2);
	}

}
