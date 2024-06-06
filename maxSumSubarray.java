
public class maxSumSubarray {

	public static void main(String[] args) {
		int[] num = {-1}; 
		int sum = 0;
		int fin =-99999;
		int i=0;
		int j=0;
		for(i=0;i<num.length;i++) {
			sum = 0;
			for(j=i;j<num.length;j++) {
				sum = sum+num[j];
				//System.out.println(i+" "+j+"  -  "+sum);
				if(sum>fin) {
					fin=sum;
				//System.out.println("sum----"+i+" "+j+" --  "+sum);
				}
			}
			
			
		}
		System.out.println(fin);
	}

}
