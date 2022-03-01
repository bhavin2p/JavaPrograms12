package staticExample;

public class TestnonStaticStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "ABC");
		Student s2 = new Student(2, "PQR");
		Student s3 = new Student(3, "XYZ");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
