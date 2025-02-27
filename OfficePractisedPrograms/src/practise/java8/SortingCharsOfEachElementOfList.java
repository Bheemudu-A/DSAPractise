package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCharsOfEachElementOfList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hello", "bheem", "comptech", "bheem");
		
		//1st sorting element based on 1st character later sorting string by characters in ascending order
		List<String> sortedList = list.stream().sorted().map(i -> i.chars().sorted().
				mapToObj(ch -> String.valueOf((char)ch)).
				collect(Collectors.joining())).
				collect(Collectors.toList());
		System.out.println("sorted list by each element : "+sortedList);
		
		
	//new Way	
	List<String> newWay =	list.stream().sorted().map(SortingCharsOfEachElementOfList::sortChar).collect(Collectors.toList());
	
	System.out.println("new Way : "+newWay);
	
	}
	
	private static String sortChar(String num) {
		
	return num.chars().mapToObj( i -> String.valueOf((char)i)).sorted().collect(Collectors.joining());
	}
	
	

}
