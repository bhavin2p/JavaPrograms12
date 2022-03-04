package collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHash = new LinkedHashMap<>();
		
		linkedHash.put("Test Analyst1", "Suzen");
		linkedHash.put("Automation Tester", "Lerato");
		linkedHash.put("Developer", "Dineo");
		linkedHash.put("Test Analyst2", "Monali");
		linkedHash.put("Test Analyst3", null);
		linkedHash.put(null, null);
		linkedHash.put(null, "Bhavin");
		System.out.println("Values in Linked HashMap = " +linkedHash );
		
		System.out.println("The size of map : " +linkedHash.size());
		
		Iterator<String> itr = linkedHash.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println("The role " +key+ " is assigned to " +linkedHash.get(key));
		}
		

	}

}
