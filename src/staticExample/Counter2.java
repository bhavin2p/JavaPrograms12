package staticExample;

public class Counter2 {

	static int count = 1;
	static String name = "Demo";

	public static void demo1() {
		count = 2;
		System.out.println(count);
		System.out.println(name);
	}
	
	public static void demo2() {
		demo1();
	}

	public static void main(String[] args) {
		demo2();
	}

}
