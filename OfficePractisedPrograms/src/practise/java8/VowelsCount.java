package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsCount {

	public static void main(String[] args) {

		String str = "Hello Java 8 Feature";

		String lowerCaseString = str.toLowerCase();

		List<Character> vowels = Arrays.asList('a', 'e','i','o','u');

		lowerCaseString.chars().mapToObj(c ->(char)c).filter(vowels::contains).forEach(System.out::print);
		//forEach(i -> System.out.print(i));
		
		System.out.println();
		
		
		//other way
		List<String> vowel = Arrays.asList("a", "e","i","o","u");
		
		String vowelsOfStr = str.chars().mapToObj(i -> String.valueOf((char) i).toLowerCase()).filter(vowel::contains).collect(Collectors.joining());
	
		System.out.println("vowelsOfStr : "+vowelsOfStr);
	}
	
}
