package upCastdownCast;

public class TakesScreenshotChild extends WebDriverSuper{
	
	public void child_print() {
		System.out.println("child Print");
	}
	
	public void child_show() {
		System.out.println("child show");
	}

	public static void main(String[] args) {
		
		WebDriverSuper w1 = new TakesScreenshotChild();
		w1.super_print();
		w1.super_show();
		
		//one way
		((TakesScreenshotChild) w1).child_print();
		TakesScreenshotChild c1 = (TakesScreenshotChild)w1;
		
		c1.child_print();
		c1.child_show();
	}

}
