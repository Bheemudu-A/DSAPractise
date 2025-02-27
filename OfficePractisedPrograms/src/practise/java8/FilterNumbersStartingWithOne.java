package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 11, 9, 18,15,23, 35);
		
				List<String> result =	list.stream().map(i -> i+"").filter(i -> i.startsWith("1")).collect(Collectors.toList());
				
				System.out.println("result : "+result);
				
				//we can convert list of strings again to integer after filering
				//List<Integer> result =	list.stream().map(i -> i+"").filter(i -> i.startsWith("1")).map( i -> Integer.parseInt(i)).collect(Collectors.toList());
	}
}
