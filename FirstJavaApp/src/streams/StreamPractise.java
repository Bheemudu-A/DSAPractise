package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractise {

	public static void main(String[] args) {
		List<Character> list = Arrays.asList('a', 'b', 'c','d','e','f','g');
		//filteringEvenNumbers
		filteringEvenNumbers(list);
		
		List<String> list2 = Arrays.asList("apple", "banana", "pear", "grapes");
		System.out.println(groupingWordsByUsingJava8(list2));
		
		List<String> list3 = Arrays.asList("Hello", " ", "World", "!");
		System.out.println(makingListIntoaSingleString(list3));
	}



	//using streams
	   private static String makingListIntoaSingleString(List<String> list3) {
			String word = list3.stream().collect(Collectors.joining());	
			return word;
		}

	private static Map<Integer, List<String>> groupingWordsByUsingJava8(List<String> list) {
		Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
		return map;
	}

	private static void filteringEvenNumbers(List<Character> list){
		Stream<Character> sc = list.stream().filter(a -> a%2!=0).map(a -> a);
		sc.forEach(System.out::println);
	}


}
