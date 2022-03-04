package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(2, "Lerato");
		map.put(3, "Suzen");
		map.put(5, "Monali");
		map.put(4, "Dineo");
		map.put(7, "Daniel");
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			System.out.println("The key "+key+ " has value " +map.get(key));
		}
	}

}
