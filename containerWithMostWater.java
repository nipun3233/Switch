
public class containerWithMostWater {

	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		int sum = 0 ; 
        int max =0 ; 
        int length = 0 ;
        int breadth = 0 ; 
        int i = 0 ; 
        int j = height.length-1;
       while(j>i){
        length = j-i+1;
        if(height[i]>height[j]){
            breadth = height[j];
            j--;
        }
        else{
            breadth = height[i];
            i++;
        }
        sum = length*breadth;
        System.out.println(sum +  "--> " + i+ " " +j);
        if(max<sum) max =sum;
       }	
       System.out.println(max);
	}
}
