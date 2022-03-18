package inheritanceDemo;

public class ICICIBank extends Bank {

	
	public void rateOfInterest() {
		System.out.println("Rate of interest 8%");
	}
	
	public void rateOfInterest1() {
		System.out.println("Rate of interest 8%");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank i1 = new ICICIBank();

		i1.rateOfInterest();

	}

}
