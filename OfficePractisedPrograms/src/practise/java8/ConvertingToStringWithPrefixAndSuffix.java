package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingToStringWithPrefixAndSuffix {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Python", "spring");
		
	String afterJoining	 = list.stream().collect(Collectors.joining(", ", "[", "]"));
	
	System.out.println("converted to string with prefix and suffix : "+afterJoining);
	
	}

}
