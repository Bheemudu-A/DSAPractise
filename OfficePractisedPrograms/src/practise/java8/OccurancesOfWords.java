package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccurancesOfWords {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one", "one", "two", "three", "four", "six", "seven");

		//based on length
		Map<Integer, List<String>> map =	list.stream().collect(Collectors.groupingBy(i -> i.length()));

		//based on content equal
		Map<String, Long>	basedOnWord =	list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		
		System.out.println(map);	
		System.out.println(basedOnWord);
	}
	
	

	

}
