package staticExample;

public class Student {
	int rollno;// instance variable
	String name;
	static String college = "ITC";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}
