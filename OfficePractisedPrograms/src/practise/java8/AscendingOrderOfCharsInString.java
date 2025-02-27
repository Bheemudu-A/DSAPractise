package practise.java8;

import java.util.stream.Collectors;

public class AscendingOrderOfCharsInString {
	
	public static void main(String[] args) {
		
		
		String input = "hello hyd";
		
		String ascendingOrder =	input.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		System.out.println("ascending order of String : "+ascendingOrder);
	}

}
