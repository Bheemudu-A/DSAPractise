package practise.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,4,5,6,7,1);
		
		//we can follow any of the pattern
//	Optional<Integer>secondHighestNum = numbers.stream().sorted((a,b) -> b-a).skip(1).findFirst();
													//(a,b) -> (b-a)
	int secondHighestNum = 	numbers.stream().sorted(Collections.reverseOrder()).skip(3).findFirst().orElse(-1);
	 
	System.out.println("secondHighestNum : "+secondHighestNum);
	
	}

}
