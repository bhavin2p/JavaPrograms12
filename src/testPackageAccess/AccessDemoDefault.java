package testPackageAccess;

public class AccessDemoDefault {
	//Access Specifier : - public / private / default / protected
	//private
	private static int a = 12;
	private void methodB() {
		int b= 10;
		System.out.println("This is private method");
	}
	public static void main(String[] args) {
		AccessDemoDefault a1 = new AccessDemoDefault();
		System.out.println(a);
		a1.methodB();
	}
}
