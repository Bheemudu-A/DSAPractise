package practise.java8;

import java.util.stream.IntStream;

public class FactorialOfDigitsOfNum {
	
	public static void main(String[] args) {
		
		int num = 234;
		
		String nums = String.valueOf(num);

		//converting char to Integer and then finding factorial
		  	int Sum = nums.chars().mapToObj(Character::getNumericValue).
		  							map(FactorialOfDigitsOfNum::factorial).
		  							reduce(0, (a,b) -> a+b);
	
		  	System.out.println("Sum : "+Sum);
		  	
		  	//2nd way
		  	int newWaySum =	nums.chars().mapToObj(Character::getNumericValue).map(i -> IntStream.rangeClosed(1, i).reduce(1, (a,b)-> a*b)).reduce(0, (a,b) -> a+b);
			
			System.out.println("newWaySum : "+newWaySum);
	}
	
	static int factorial(int n) {
		return IntStream.rangeClosed(1, n).reduce(1, (a,b) -> a*b);
		
	}

}
