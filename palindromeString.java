
public class palindromeString {

	public static void main(String[] args) {
		String s1= "NIPIN";
		String s2= "";
		char t ;
		for(int i = 0;i<s1.length();i++){
			t=s1.charAt(i);
			s2=t+s2;
		}
		if(s1.equals(s2)) {
			System.out.println("yes it is a palinnndrome");
		}
		else {
			System.out.println("no it is not a palinnndrome");
		}
		

	}

}
