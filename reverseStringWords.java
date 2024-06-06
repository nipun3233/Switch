import java.util.*;
public class reverseStringWords {

	public static void main(String[] args) {
		
		String s = "dekhlo bhai iss baar   sahi hai na ";
		Stack<String> st = new Stack<String>(); 
		String str = "";
		s += " ";
		//System.out.println(st.size());
		for(int i = 0;i<=s.length()-1 ; i++) {
			if(s.charAt(i)==' ') {
				//System.out.println("ye lo -"+str+"bas  ");
				st.push(str);
				
				str = "";
				
			}
			else if(s.charAt(i)!= ' ') {
				str = str + s.charAt(i);
			}
		}
		String ans = "";
		while(st.size()!=1) {
			if(st.peek()==" ") {
				System.out.println(st.peek());
				st.pop();
			}
			else {
				ans = ans +st.peek()+" ";
				st.pop();
			}
		}
		ans = ans+st.peek();
		
		System.out.println(ans);
			
	}

}
//@8807e25