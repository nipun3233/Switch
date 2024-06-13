
public class ReverseInteger {

	public static void main(String[] args) {
		int x = -12340;
		
		
		String s = String.valueOf(x);
		char temp ;
		int l = 0 ; 
		int r = s.length()-1;
		
		if(s.charAt(0) == '-') {
			l=1;
		}
		while(s.charAt(r) == '0') {
			r--;
		}
		
		while(l<r) {
			temp=s.charAt(r);
			s.charAt(r)=s.charAt(l);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
