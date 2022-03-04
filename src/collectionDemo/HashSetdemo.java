package collectionDemo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetdemo {

	public static void main(String[] args) {
		
		List<String> abc = new LinkedList<>();
		
		abc.add("Hello");
		abc.add("two");
		abc.add("Five");
		abc.add("india");
		
		Set<String> h1 = new HashSet<>();
		h1.add("a");
		h1.add("two");
		h1.add("three");
		h1.add("four");
		h1.add("two");
		h1.addAll(abc);
		h1.remove("one");
		int len = h1.size();
		System.out.println(len);
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);

	}

}
