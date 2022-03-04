package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.MalformedInputException;
import java.sql.SQLDataException;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int result;
		String st = null;
		
		try {
		String ab;
		System.out.println("no exception");
		}
		catch (Exception e) {
			System.out.println("Cast exception");
		}
		finally {
			System.out.println("This wil always executed");
		}
		
		int []b = {1,2,5,4};
		try {
			System.out.println(b[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error");
		}
		catch(NullPointerException e) {
			System.out.println("error2");
		}
		
		try {
			result = a/0;
			System.out.println("10 divided by zero = " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("There is some issue in code");
		}
		
		
		
		System.out.println("Normal flow");
		
		
		
		

	}

}
