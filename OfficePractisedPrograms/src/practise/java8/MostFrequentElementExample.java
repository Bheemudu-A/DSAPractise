package practise.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostFrequentElementExample {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("banana", "apple", "lemon", "banana", "banana", "lemon");
		
	//Map.Entry<String, Long> mostReapetedWord = 	
			words.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).
														entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
	
//	System.out.println(mostReapetedWord);
	
	System.out.println("using Java7 : "+findMostRepeatedWord(words));
	
	}

	//using Java7
	private static String findMostRepeatedWord(List<String> words) {
	
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		int count =0;
		String mostReapetedWord = null;
		for(String str : map.keySet()) {
			
			if(map.get(str)>count) {
				count = map.get(str);
				mostReapetedWord = str;
			}
		}
		
		return mostReapetedWord;
	}
	
	

}
