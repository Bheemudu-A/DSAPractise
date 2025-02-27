package practise.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersInList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,4,5,6);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
			//	  list.stream().reduce(0, (a,b) -> a+b); we can do both ways
		System.out.println("sum : "+sum); 
	}

}
