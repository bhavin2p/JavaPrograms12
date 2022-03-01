package abstractExamples;

//Parent Class
public abstract class  AbstractDemo {
	
	public abstract void TestMethod();
	
	
	
	public static void Test2() {
		System.out.println("This is static method");
	}
	
	final double pi=3.14;
	
	
	public void Test1() {
		System.out.println("This is method from Parent Class");
	}
	
	//Final / Finalize / Finally
	//overriding is not allowed
	public final void Test3() {
		System.out.println("This is final method");
	}
	

}
