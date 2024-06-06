
public class nextPermutation {

	public static void main(String[] args) {
	int [] num = {1,6,5,4,3,2};
	int nums[] = num;
		int l = num.length-1;
		int index = -1;
		int temp;
		
		
		for (int i = l ; i>0 ;i--) {
			if(num[i]>num[i-1]) {
				index = i-1;
				break;
			}
		}
		
		if(index == -1) {
			num = reverse(num,0);
		}
		else {
		for(int i = l;i>=index;i--) {
			if (num[i]>num[index]) {
				temp = num[i];
				num[i]=num[index];
				num[index]= temp;
				break;
			}
		}
		
		//System.out.println(num[1]+" "+index);
		
		num = reverse(num,index+1);
		
		}
		for (int i = 0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
	}
	
	
	private static int[] reverse(int[] arr, int index) {
		int l = arr.length-1;
		int [] arr2 = new int [l+1-index];
		int k=0;
		for(int i = arr.length-1;i>= index ;i--) {
			arr2[k]=arr[i];
			//System.out.println(arr[i]);
			k++;
		}
		
		k = 0;
		for(int i = index;i<=l;i++) {
			arr[i]=arr2[k];
			k++;
		}
		return arr;
		
	}

	
	
}	

