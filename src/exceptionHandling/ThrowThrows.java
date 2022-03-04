package exceptionHandling;

import java.io.IOException;

public class ThrowThrows {

	public void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	public void n() throws IOException{
		m();
	}

	void p() {
	
			try {
				n();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void main(String[] args) {
		ThrowThrows obj = new ThrowThrows();
		obj.p();
		System.out.println("normal flow...");

	}

}
