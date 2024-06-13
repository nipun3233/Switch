
public class SortColors {

	public static void main(String[] args) {
		int []arr = {2,0,2,1,1,0};
		int zero = 0;
		int one = 0;
		int two = 0;
		int index = 0;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
			}
			else if(arr[i]==1) {
				one++;
			}
			else {
				two++;
			}
		}
		System.out.println(zero+ " " + one + " " + two);
		int[] res = new int [arr.length];
		while(zero!=0) {
			res[index] = 0;
			zero--;
			index++;
		}
		while(one!=0) {
			res[index] = 1;
			one--;
			index++;
		}
		while(two!=0) {
			res[index] = 2;
			two--;
			index++;
		}
		for(int i = 0 ; i<res.length;i++) {
			System.out.println("tw  "+res[i]);
		}
	}

}
