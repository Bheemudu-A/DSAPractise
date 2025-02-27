package practise.java8;

import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		
		String input = "swiss";
		Character firstNonRepeating = input.chars()
		                                   .mapToObj(c -> (char) c)
		                                   .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
		                                   .findFirst()
		                                   .orElse(null);
		System.out.println(firstNonRepeating); // Output: w
		
		//sorting string in ascending order
		
	String ascendingOrder =	input.chars().mapToObj(i -> String.valueOf((char)i)).sorted().collect(Collectors.joining(""));
		System.out.println("ascending order of String : "+ascendingOrder);
	}

}
