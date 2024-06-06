
import java.util.Stack;  

public class validParentheses {

	public static void main(String[] args) {
		Stack<Character> stk = new Stack<>();
		char [] arr = {'(',']',')'};
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
				stk.push(arr[i]);
			}
			else if(arr[i] == ']' && stk.size() == 0|| arr[i] == '}' && stk.size() == 0|| arr[i] == ')' && stk.size() == 0){
	               System.out.println("nonono");
	            }
			else if(arr[i] == '}' && stk.peek() == '{') {
				stk.pop();
				System.out.println("yes");
			}
			else if(arr[i] == ')' && stk.peek() == '(') {
				stk.pop();
				System.out.println("yes");
			}
			else if(arr[i] == ']' && stk.peek() == '[') {
				stk.pop();
				System.out.println("yes");
			}
			else {
				System.out.println("no yes no");
			}
			
		}
		System.out.println(stk.size());
		System.out.println(stk);
		
	}

}
