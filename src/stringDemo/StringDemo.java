package stringDemo;

public class StringDemo {

	public static void main(String[] args) {

		
//StringBuffer
//StringBuilder
		//String constant pool
		String str = "Hello World";
		String str1 = "world";
		//str = "World Hello";

		int len = str.length();
		System.out.println(len);
		
		//Heap memory
		String str2 = new String("Hello World");
		String str3 = new String("Hello World");
		
		char capital = 'H';
		char small = 'h';
		//int capitalH = capital;
		//int smallh = small;
		
		System.out.println((int)capital);
		System.out.println((int)small);
		
		/*System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	
		char ch = str.charAt(4);
		System.out.println(ch);
		
		/*
		int count = 1;
		int count1 = 1;
		count++;
		int count2 = 2;
		//int count3 = new int(2);
		System.out.println(System.identityHashCode(count));
		System.out.println(System.identityHashCode(count2));
		*/
		
	}

}
