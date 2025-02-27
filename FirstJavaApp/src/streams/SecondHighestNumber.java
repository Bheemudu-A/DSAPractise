package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
	
	//find 2nd highest number
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,1,2,3,6,8,7,5,2,1);
		
		Optional<Integer> number = list.stream().sorted((a,b)-> b-a).distinct().skip(1).findFirst();
		
		System.out.println("2nd Highest number is : "+number);
		
	}

	/*
	 * sorted((a,b)-> b-a) --> for descending order,
	 * sorted((a,b)-> a+b) --> for ascending order
	 * skip(n); --> skips n elements from collection
	 * distinct --> return unique elemenst from collection
	 */
}
