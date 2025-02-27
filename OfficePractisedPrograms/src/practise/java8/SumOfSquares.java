package practise.java8;

import java.util.stream.IntStream;

public class SumOfSquares {
	
	public static void main(String[] args) {
		
		int num = 3;
		
		int sumOfSquare  = IntStream.rangeClosed(1, num).map(n -> n*n).sum();   //reduce(0, Integer::sum);
		
		System.out.println("sumOfSquare : "+sumOfSquare);
	}

}
