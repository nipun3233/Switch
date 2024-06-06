import java.util.*;
public class hashMapImplementation {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 120);
		map.put("china", 100);
		map.put("america", 90);
	System.out.println(map);
	System.out.println();
	
	for(Map.Entry<String,Integer> e : map.entrySet()) {
		System.out.print(e.getKey());
		System.out.print(e.getValue());
		System.out.println(" ");
	}
	
	
	if(map.containsKey("India")) 
	{
		System.out.println("yes" + map.get("India"));
	}
	
	
	
	
	
	
	
	
	}
	
}
