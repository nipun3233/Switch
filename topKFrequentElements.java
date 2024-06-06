import java.util.*;

public class topKFrequentElements {

	public static void main(String[] args) {
		int []nums = {1,1,1,2,2,3,1,2,4,};
		int k =2;
		 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			HashMap<Integer ,Integer> map = new HashMap<Integer ,Integer>();
			for(int i = 0 ; i<nums.length;i++) {
				if(map.containsKey(nums[i])) {
					map.put(nums[i],map.get(nums[i])+1);
				}
				else {
					map.put(nums[i],1);
				}
			}
			System.out.println(map);
			for(Map.Entry<Integer, Integer> e : map.entrySet()) { 
	            pq.add(e.getValue());
	        }
			
	        int []karr = new int[k];
				for(int i = 0 ; i <karr.length;i++) {
					karr[i]=pq.poll();
					System.out.println(karr[i]);
				}
				
				
	        int n = 0 ;
	    
			for(Map.Entry<Integer, Integer> e : map.entrySet()) { 
	            if(karr[n]==e.getValue()){
	                karr[n]=e.getKey();
	                System.out.println(karr[n]);
	                n++;
	            }
	            if(n==k)
	            	break;
			}

			
			for(int i = 0 ; i<karr.length;i++) {
				System.out.println("final" + karr[i]);
			}


			
//			System.out.print(e.getKey());
//			System.out.print(e.getValue());
//			System.out.println(" ");
		}
		
		
		
	}

