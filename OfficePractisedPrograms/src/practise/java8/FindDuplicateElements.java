package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,4,6,2,1);
		
		//unique elements
		Set<Integer> set = list.stream().sorted().collect(Collectors.toSet());
		System.out.println("set : "+set);
		
	List<Integer> duplicateElements =	list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).
										entrySet().stream().filter( n -> n.getValue()>1).
										map(Map.Entry :: getKey).collect(Collectors.toList());
	
	
	
	
	System.out.println(duplicateElements);
	}

}
