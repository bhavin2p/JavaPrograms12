package abstractExamples;
//child class
public class ChildDemo extends AbstractDemo {

	public void TestMethod() {
		System.out.println("implemented abstract method");
	}
	public void Test1() {
		super.Test1();
		System.out.println("This is method from Child Class");
	}
	
	public static void main(String[] args) {
		
		ChildDemo c1 = new ChildDemo();
		c1.Test1();	
		c1.TestMethod();
	}
}



//super and super() keyword
//