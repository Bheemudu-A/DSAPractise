package practise.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSortingInList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hello", "bheem", "comptech", "bheem");
		
		Set<String> sortedList = list.stream().sorted().collect(Collectors.toSet());
		
		//we can use distint() also to sort
		System.out.println(sortedList);
	}

}
