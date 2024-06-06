
public class reverseCharArray {

	public static void main(String[] args) {
		 char [] ch = {'h','e','l','l','o'};
	        int k = ch.length-1;
	        char temp ;
	        for (int i=0;i<=k/2;i++){
	            temp=ch[i];
	            ch[i]=ch[k];
	            ch[k]=temp;
	            System.out.println("ab");
	            k--;
	        }
	        for (int j=0;j<ch.length;j++) {
	        	System.out.println(ch[j]);
	        }
	}

}
