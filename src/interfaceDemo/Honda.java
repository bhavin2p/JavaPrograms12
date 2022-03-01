package interfaceDemo;

public class Honda implements Car, Car2 {
	
	int b = 10;

	public static void main(String[] args) {
		
		Car c1 = new Honda();
		
		c1.start();
		Honda h1 = new Honda();
		
		h1.start();
		h1.stop();
		h1.FMRadio();
		h1.Automatic();
		Car.music();

	}

	public void start() 
	{
		b=20;
		System.out.println("Car started : print value a : " +b);
	}

	public void stop() {
		System.out.println("car stopped");
	}

	public void FMRadio() {
		System.out.println("FM started");
	}

	public void Automatic() {
		System.out.println("Start car automatic");
	}

}
