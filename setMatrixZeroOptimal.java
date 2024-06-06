
public class setMatrixZeroOptimal {

	public static void main(String[] args) {
		int [][] mat = {
				{0,1,2,3},
				{3,4,5,2},
				{1,0,1,5}
		};
		int m = mat.length;
		int n = mat[0].length;
		int col[]= new int[m];
		int row[]= new int [n];
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if (mat[i][j]==0) {
					col[i]=1;
					row[j]=1;
				}
			}
		}
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(col[i]==1||row[j]==1) {
					mat[i][j] = 0;
				}
			}
		}
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(mat[i][j]);
			}
			}
		
}
}
