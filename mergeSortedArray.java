import java.util.*;
public class mergeSortedArray {

	public static void main(String[] args) {
		int [] num1= {1,2,3,4,0,0};
		int l = num1.length-1;
		int [] num2= {2,5};
		int m = 4; 
		int n = 2;
		int k = 0;
		int temp=0;
		while (n>0) {
			num1[m]= num2[k];
			m++;
			n--;
			k++;
		}
		Arrays.sort(num1);
		
		for (int j = 0 ; j<num1.length;j++) {
			System.out.println(num1[j]);
		}
	}
	
}
