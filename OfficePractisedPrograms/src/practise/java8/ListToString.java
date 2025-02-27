package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "python", "spring");
		
		String words = list.stream().collect(Collectors.joining(", "));
		
		System.out.println(words);
		
	}

}
