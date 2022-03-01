package inheritanceDemo;

public class AxisBank extends Bank{

	public void rateOfInterest() {
		System.out.println("Rate of interest 7%");
	}
	
	public static void main(String[] args) {
		
		AxisBank a1 = new AxisBank();
		a1.rateOfInterest();

	}

}
