package practise.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("orange", "lemon", "muskmelon");
		
		//1st way to find longest
		String MaxLenElement = fruits.stream().
											  reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).
											  orElse("No element");
		
		//another way using sorted
		List<String> largestElement = 	fruits.stream().sorted((str1, str2) -> (str2.length()-str1.length())).collect(Collectors.toList());//.findFirst().orElse("No element");
		
		//shortest
		String smallestString =fruits.stream().sorted().findFirst().orElse("No element");
		
		System.out.println("LongestString : "+MaxLenElement+"\n"+"smallest String : "+smallestString+"\n"+" largestElement : "+largestElement);
	}
}
