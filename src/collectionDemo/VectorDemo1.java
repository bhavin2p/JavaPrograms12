package collectionDemo;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector<String> vc1 = new Vector<>();
		
		vc1.add("Momentum");
		vc1.add("Metropolitan");
		vc1.add("Holdings");
		vc1.add("TCS");
		
		System.out.println(vc1);
		
		for(String string : vc1) {
			System.out.println(string);
		}
		
		int size = vc1.size();
		
		System.out.println(size);
		Collections.sort(vc1);
		
		System.out.println(vc1);


	}

}
