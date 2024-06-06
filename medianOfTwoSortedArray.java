import java.util.Arrays;

public class medianOfTwoSortedArray {

	public static void main(String[] args) {
		int [] nums1 = {1,3,6,5};
		int [] nums2 = {2,4};
		int l = nums1.length;
		int m = nums2.length;
		int r = l+m ;
		int [] res = new int[l+m];
		double rw ;
		for(int i = 0 ; i<nums1.length;i++ ) {
			res[i] = nums1[i];
		}
		for(int i = 0 ; i<nums2.length;i++ ) {
			res[l] = nums2[i];
			l++;
		}
		Arrays.sort(res);
		for(int i = 0 ; i<res.length;i++ ) {
			System.out.println(res[i]);
		}
		
		
		
		if(r%2 == 0){
			double lt = res[r/2] ;
			double rt = res[r/2 -1];
			rw = (rt +lt)/2;
			
		}
		else {
			rw = res[r/2];
			System.out.println(rw);
		}
	
		System.out.println(rw);
		
	}

}
