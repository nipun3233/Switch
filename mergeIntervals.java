import java.util.*;
public class mergeIntervals {

	public static void main(String[] args) {
	int arr[][]= {{1,7},{3,5},{6,10},{9,12},{11,14},{15,18}};
	int res[][] = new int[6][2];
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	int k=0;
	for(int i =0 ; i<arr.length;i++) {
	
	int j = i+1;
	while(arr[i][1]>=arr[j][0]) {
		System.out.println(arr[i][0]+""+arr[i][1]+" "+arr[j][0]+""+arr[j][1]);
		j++;
	}
	
	res[k][0] = arr[i][0];
	res[k][1] = arr[j][1];
	k++;
	i = j;
	
	
	}
	
	}

}
