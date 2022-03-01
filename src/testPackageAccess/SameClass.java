package testPackageAccess;

public class SameClass {
	
	int a = 13;
	
	public static void main(String[] args) {
		ProtectedDemo a1 = new ProtectedDemo();
		System.out.println(ProtectedDemo.a);
		a1.protectMethod();
	}

}
