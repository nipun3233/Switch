
public class reverse_String {

	public static void main(String[] args) {
	String s = "abcdefgh";
	String ns = "";
	test1 ob = new test1();
	s=ob.revStr(s);
	//System.out.println(s);
	}

}

class test1{
	char ch ;
	String revStr(String s) {
		char arr[]= s.toCharArray();
		int len = arr.length-1;
		int count = (arr.length+1)/2;
		//System.out.println(arr);
		for (int i=0;i<count;i++) {
			//System.out.println(arr);
			ch = arr[len];
			arr[len]= arr[i];
			arr[i]=ch;
			len--;
			//System.out.println(arr);
		}
		String string = String.valueOf(arr);
		return string;
		
	}
}
