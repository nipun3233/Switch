
public class lengthOfLastWorld {

	public static void main(String[] args) {
		String str = " H e l  lo  World  ";
		 int j = 0; 
		char [] out =  new char [str.length()]; 
		int i = str.length()-1;
		int count = 0 ;
		while (i>=0) {
			
			if(str.charAt(i) == ' ') {
				--i;
				
				if(count > 0)
					break;
				
			}
			else {
				out[j] = str.charAt(i);
				j++;
				i--;
				count=count+1;
			}
			
			
		}
		
		System.out.println(count);
		
	}

}
