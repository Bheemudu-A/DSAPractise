package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertingToUpperCase {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "python", "cleo");
		
		List<String> upperCaseList =	list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseList);
		
		//to find length of String
	  Map<Integer, List<String>>  iss =   list.stream().collect(Collectors.groupingBy(i->i.length()));
		
		System.out.println(" iss : "+iss);
	
	}

}
