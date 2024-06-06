
public class setMatrixZero {

	public static void main(String[] args) {
		
		int [][] mat = {
				{0,1,2,0},
				{3,4,5,2},
				{1,2,1,5}
		};
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(mat[i][j]==0) {
					//System.out.println(i+"y"+j);
					markcol(i,j,mat);
					markrow(i,j,mat);
				}
				}
		}
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(mat[i][j]);
				}
		}
		
		
		
			}
	
	
	private static void markcol(int c,int r, int[][] mat) {
		int m=3;
		int n=4;
		for (int i=0;i<m;i++) {
			if(mat[i][r]!=0)
				mat[i][r]=-1;
		}
	}
	
	private static void markrow(int c,int r, int[][] mat) {
		int m=3;
		int n=4;
		for (int i=0;i<n;i++) {
			if(mat[c][i]!=0)
				mat[c][i]=-1;
		}
	}
	


	
	

}

