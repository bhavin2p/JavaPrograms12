package collectionDemo;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10); //1
		l1.add(1);
		l1.add(12);
		l1.add(12);
		l1.add(15);
		l1.add(20);
		//System.out.println(l1);
		/*for(int i : l1) {
				System.out.println(i);
		}*/
		
		//sort using for loop
		for(int i=0; i<l1.size(); i++) {
			for(int j=i+1; j<l1.size();j++) {
				if(l1.get(i)>l1.get(j)) {
					int temp = l1.get(i);
					l1.set(i, l1.get(j));
					l1.set(j, temp);
				}
			}
		}
		System.out.println(l1);
		
		
		//Collections.sort(l1, Collections.reverseOrder());
		
		//System.out.println(l1);
		
		/*System.out.println(l1.indexOf(12));
		System.out.println(l1.size());
		l1.add(1, 15);
		System.out.println(l1);
		l1.set(0, 20);
		System.out.println(l1);
		*/
	}

}
