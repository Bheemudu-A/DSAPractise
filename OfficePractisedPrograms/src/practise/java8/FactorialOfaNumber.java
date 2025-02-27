package practise.java8;

import java.util.stream.IntStream;

public class FactorialOfaNumber {
	
	public static void main(String[] args) {
		
		Integer num = 5;
		
	//rangeClosed includes last num, range is exclusive of last num
	int factorial =	IntStream.rangeClosed(1, num).reduce(1, (a,b) -> a*b);
	
	System.out.println("factorial : "+factorial);
	
	//sum of even Numbers
	int sum =  IntStream.rangeClosed(1, num).filter(a -> a%2==0).reduce(0, (a,b) -> a+b); //or reduce(1, (a.b) -> a+b));
	System.out.println("sum of naturam nums : "+sum);
		
		
	}

}
