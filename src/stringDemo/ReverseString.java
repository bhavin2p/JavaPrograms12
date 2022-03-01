package stringDemo;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		
		String str1 = "aaabbbccccdd";
		
		//a3b3c4d2
				
		
		int len = str.length();
		String rev = "";
		System.out.println(str);
		for(int i=len-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		

	}

}
