
public class boxDemo {

	public static void main(String[] args) {
		box ob = new box();
		
		int result;
		ob.meth();
		result=ob.meth(9);
		System.out.println(result);
		result=ob.meth(1,2,3);
		System.out.println(result);
	
	}

}
