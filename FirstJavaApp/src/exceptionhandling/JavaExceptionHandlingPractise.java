package exceptionhandling;

import java.awt.dnd.InvalidDnDOperationException;
import java.security.InvalidAlgorithmParameterException;

public class JavaExceptionHandlingPractise {

	public static void main(String[] args) {
	//	sampleTest(0);//trycatchfinally block
	//	methodToKnowThrow(101); //throw
		throwsDriver();//throws
	}
	
	//throw
	public static void methodToKnowThrow(int num) {
		
		try {
			if(num>100) {//throw is used only when you know what type of exception we will get, and only one type of exception we can throw
				throw new InvalidAlgorithmParameterException("Invalid number");
			}
		}catch(InvalidAlgorithmParameterException e) {
	//	 e.printStackTrace(); //to print exception
			
		}
		System.out.println("Successfully completed Throw exception");
	}
	
	
	public static void throwsDemo(String str) throws NullPointerException{
		
		if(str.equals("") || str.equals(null)) {
		//	throw new NullPointerException();//it is not mandatory when we declare throws
		}else {
			System.out.println(str);
		}
	}
	
	public static void throwsDriver() {
		
		try {
			throwsDemo(null);
		}catch (Exception e) {
	//		e.printStackTrace();
			System.out.println("catch block handled Throws");
		}
		System.out.println("Throws blocked excuted by handling at catch");
	}
	
	
	
	
	//try,catch, finally block
	public static void sampleTest(int num) {

		try {

			if(10/num>0) {
				System.out.println("Excuted");
			}
		} catch (Exception e) {
			System.out.println("Exception caught");
		}finally {
			System.out.println("Finally exception caught");
		}

		System.out.println("Catch block handled exception");
	}

}
