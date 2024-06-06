
public class longestPrefix {

	public static void main(String[] args) {
		String[] input = {"nipun","nipuniika","nipul","nips"};
		String prefix = input[0];
		for (int i=1;i<input.length;i++) {
			while(input[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		
		System.out.println(prefix);
	
		
	}
}
