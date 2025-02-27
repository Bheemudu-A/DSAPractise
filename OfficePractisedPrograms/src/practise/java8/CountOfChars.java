package practise.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfChars {
	
	public static void main(String[] args) {
		
		String str = "Bheemudbu";
		
		Map<String, Long>  map = str.chars().mapToObj(i ->  String.valueOf((char)i).toLowerCase()).collect(Collectors.groupingBy(i ->i, Collectors.counting()));
		
		System.out.println("map : "+map);
	}

}
