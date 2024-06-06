
public class search2DMatrix {

	public static void main(String[] args) {
	int [][]mat = {{1},{3}};
	int r = mat.length-1;
	int c = mat[0].length-1;
	int k = 1;
	int index = 0 ;
	boolean bol = false;
		System.out.println(r+" "+c );
		for(int  i = 0 ; i <=r;i++) {
			if(mat[i][r]==k) {
				//System.out.println(mat[i][3]);
				index = i ;
				bol = true;
				break;
			}
			else if(mat[i][r]>k) {
				//System.out.println(mat[i][3]);
				index = i;
				break;
			}
			
		}
	
		
	for(int i = 0;i<=c;i++) {
		if (mat[index][i]==k) {
			bol = true;
		}
	}
	
	
	System.out.println(bol);

	
	}

}
