package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindingEvenNumbers {

	public static void main(String[] args) {
		
		List<Character> list = Arrays.asList('a', 'b', 'c','d','e','f','g');
		filteringEvenNumbers(list);
	}
	
	private static void filteringEvenNumbers(List<Character> list){
		Stream<Character> sc = list.stream().filter(a -> a%2!=0).map(a -> a);
		sc.forEach(System.out::println);
	}
}
