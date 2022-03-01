package constructorExample;

public class MethodOverloadingExample {
	
	//Method overloading / compile-Time polymorphism / static method dispatch
	public void Test1() {
		System.out.println("Test1 with no parameter");
	}
	
	public void Test1(String s) {
		System.out.println("Test1 with single argument datatype as String" +s) ;
	}

	public static void main(String[] args) {
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		m1.Test1();
		m1.Test1("XYZ");

	}

}


//overriding