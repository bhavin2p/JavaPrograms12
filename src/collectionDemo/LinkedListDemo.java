package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> abc = new LinkedList<>();
		
		abc.add("Hello");
		abc.add("two");
		abc.add("Five");
		abc.add("india");
		
		List<String> a1 = new LinkedList<>();
		
		a1.add("South Africa");
		a1.add("Momentum");
		a1.addAll(abc);
		//System.out.println(a1);
		
		
		for(int i=0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		/*for(String s : abc) {
			System.out.println(s);
		}*/
		//System.out.println(abc);
		/*
		Iterator<String> i = abc.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		

	}

}
