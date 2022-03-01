package constructorExample;

public class Constructor1 {
	
	//Constructor Overloading
	public Constructor1(String s) {
		System.out.println("Hello World = " +s);
	}
	
	public Constructor1(int s) {
		System.out.println("Hello World = " +s);
	}
	
	public Constructor1(int s, String s1) {
		System.out.println("Hello World = " +s +s1);
	}
	
	public Constructor1() {
		System.out.println("Hello World without parameter");
	}
	
	public void test1() {
		System.out.println("This is just a method");
	}
	
	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		Constructor1 c1 = new Constructor1(200);
		Constructor1 c2 = new Constructor1(100);
		Constructor1 c3 = new Constructor1(100, "ABC");
		c.test1();
	}
}
