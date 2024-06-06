
public class sortColor75 {

	public static void main(String[] args) {
		int [] prices = {2,4,1};
		 int min = prices[0];
	        int max = 0;
	        int stock = 0;
	        
	        if (prices.length==1){
	            System.out.println("0");
	        }
	        else{
	        for(int i = 0;i<prices.length;i++){
		            
		        	if(prices[i]<min){
		                min = prices[i];
		                stock = 1;
		                max=0;
		                System.out.println(min+"min "+i);
		            }
		            
		            if(stock==1){
		            		if(prices[i]>max){
		                max = prices[i];
		                System.out.println(max+"  max"+i);
		            		}
		            	} 
		            
		        	}
		     
	        System.out.println(max - min);
	        }
		
		
	}

}
