package collectionDemo;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> vc1 = new Vector<>();
		vc1.add(12);
		vc1.add(32);
		vc1.add(43);
		vc1.add(1);
		
		Collections.sort(vc1);
		
		System.out.println(vc1);

	}

}
