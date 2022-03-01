package testPackageAccess;
public class AccessDemo {
	//Access Specifier : - public / private / default / protected
	//Default Method
	int a = 10;
	int methodA(){
		char a = 'a';
		return (int) a;
		}
	
	public static void main(String[] args) {
		AccessDemo a1 = new AccessDemo();
		System.out.println(a1.methodA());
	}
}
//abstration
//encapuslation
//static = classname.variablename / classname.methodname
//interface
//inhertiance
//exception handling
//Web
