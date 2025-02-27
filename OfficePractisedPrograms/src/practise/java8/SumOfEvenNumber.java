package practise.java8;

import java.util.stream.IntStream;

public class SumOfEvenNumber {
	
	public static void main(String[] args) {
		
		Integer num = 5;
		
		//sum of n natural nums
		int sum = IntStream.rangeClosed(1, num).filter(a ->a%2==0).reduce(0, (a,b) -> a+b);//we can use reduce(0, Integer::sum);
		
		System.out.println("sum of n natural nums : "+sum);
	}

}
