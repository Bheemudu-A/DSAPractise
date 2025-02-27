package lamda;

public class Driver {

	public static void main(String[] args) {
		
		//this is general implementation for interface upto java 7, 
		//as creating class to provide implementation for interface method
		//but creating class to define one method is not good, so in java8 introduced lamda expresion which used to implement functional interface without creating extra class
//		ILamda lam = new LambdaExpression();  
	//	lam.demo();
		
		
		// this is implimentation for ILamda interface, without creating new class
		ILamda lam;
		lam = new ILamda() {
			
			@Override
			public void demo(){
				System.out.println("Using Object of interface");
				
			}
			
		};
		
		lam.demo();
		
		
		//now lets simplify above method using lamda  expresion
		//we can obtain lamda expression by removing method declaration
		ILamda ll;
		ll = () -> {
			System.out.println("Using Lamda");
		};
		
		ll.demo();
		
		}
	
	
}
