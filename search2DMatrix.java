
public class search2DMatrix {

	public static void main(String[] args) {
	int [][]mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	int n = mat.length-1;
	int s = mat[0].length-1;
	int k = 11;
	int index = 0 ;
	boolean bol = false;
	
		for(int i = 0 ; i<=n;i++) {
			if(mat[i][s]== k) {
				System.out.println("yes "+ i);
				index = i ;
			}
			else if(mat[i][s]>k) {
				System.out.println("ja ye kya hua " + i);
				index = i ;
				break;
			}
		}

		System.out.println(20/0);
		for(int i = s ; i >= 0; i--) {
			if(mat[index][i] == k) {
				System.out.println(index + " " + i);
			}
		}
		
		
		
		
		
		
		
//		for(int  i = 0 ; i <n;i++) {
//			if(mat[i][s]==k) {
//				System.out.println(mat[i][s]);
//				index = i ;
//				
//				break;
//			}
//			else if(mat[i][r]>k) {
//				//System.out.println(mat[i][3]);
//				index = i;
//				break;
//			}
//		}
//	
//		
//	for(int i = 0;i<=c;i++) {
//		if (mat[index][i]==k) {
//			bol = true;
//		}
//	}
//	
//	
//	System.out.println(bol);

	
	}
	
}
