//matrix construction and printing
public class Matrix {
	static int mat [][] = {
			{0,1,1,0},
			{1,1,1,1},
			{1,1,1,1}
	};
	
	
	 public static void markRow(int i) {
		for(int j=0;j<i;j++) {
			if(mat[i][j]!=0) {
				mat[i][j]= -1;
			}
		}
	}
	 
	 public static void markCol(int j) {
			for(int i=0;i<j;i++) {
				if(mat[i][j]!=0) {
					mat[i][j]= -1;
				}
			}
		}
	
	
	public static void main(String[] args) {
		
	
		for(int i =0;i<3;i++) {
			for(int j= 0;j<4;j++) {
				if(mat[i][j]==0) {
					markRow(i);
					markCol(j);
				}
			}
		}
		
String arr = new String();
for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr = arr + mat[i][j] + " ";
			}
			System.out.println(arr);
			arr = "";
			System.out.println(" ");
		}

		
	}	
}
