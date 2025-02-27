package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NLargestNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,8,9);
		
		List<Integer> top3Largestnum =    list.stream().sorted((a,b) -> (b-a)).limit(3).collect(Collectors.toList());
		System.out.println(top3Largestnum);
	}

}
 