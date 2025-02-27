package practise.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
	
	
	
	public static void main(String[] args) {
		
		int num = 29;
		
		//is prime
		boolean isPrime = 	IntStream.rangeClosed(2, num/2).noneMatch(i -> num%i==0);
		System.out.println("isPrime : "+isPrime);
		
		List<Integer> primes = IntStream.rangeClosed(2, num) // Generate numbers from 2 to 11
                .filter(PrimeNumber::isPrime) // Filter primes
                .boxed() // Convert int to Integer
                .collect(Collectors.toList()); 
		
		System.out.println("List of Prime Numbers : "+primes);
		
		//using Java7
		System.out.println("is prime using Java7 : "+isPrimeNumber(num));
	}
	
	private static boolean isPrime(int num) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)) // Check divisors up to sqrt(num)
                        .allMatch(divisor -> num % divisor != 0); // Ensure no divisors
        
    }
	
	
	//most efficient way
	private static boolean isPrimeNumber(int num) {
		
		if(num <= 1) return false;
		if(num ==2 || num ==3) return true;
		if(num%2 ==0 || num%3 ==0) return false;
		
		for(int i =5; i*i <= num;i += 6) {
			if(num%i == 0 || num%(i+2) ==0) {
				return false;
			}
		}
		
		return true;
	}

}
