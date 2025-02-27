package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class targetSum {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(9,1,8,2,4,6,5,7);
		int target = 10;
		
		List<String> pairs =   list.stream().
								flatMap(num1 -> list.stream().filter(num2 -> num1<num2 && num1+num2==target).
							    map(num2 -> "("+num1+", "+num2+")")).collect(Collectors.toList());
		
		
		System.out.println(pairs);
		
		
	}
}
