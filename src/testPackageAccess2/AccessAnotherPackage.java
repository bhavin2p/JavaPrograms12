package testPackageAccess2;

import testPackageAccess.AccessDemo;
import testPackageAccess.ProtectedDemo;
//inheritance
public class AccessAnotherPackage extends ProtectedDemo {

	static int a = 30;
	public static void main(String[] args) {

		AccessDemo a1 = new AccessDemo();
		System.out.println(ProtectedDemo.a + " " +a);

	}

}
