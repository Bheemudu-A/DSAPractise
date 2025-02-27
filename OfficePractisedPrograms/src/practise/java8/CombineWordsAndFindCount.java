package practise.java8;
import java.util.*;
import java.util.stream.Collectors;

public class CombineWordsAndFindCount {
	

	
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("aa", "bb", "c", "aa");

	        Map<Character, Long> result = list.stream()
	            .flatMap(s -> s.chars().mapToObj(c -> (char) c)) // Convert each string into a stream of characters
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	        
	       
	        System.out.println(result); // Output: {a=4, b=2, c=1}
	        
	        //try with character
	        List<Character> listChar = Arrays.asList('a', 'b', 'c', 'a');

	        Map<Character, Long> chae = listChar.stream()// Convert each string into a stream of characters
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

	        
	        System.out.println(chae); // Output: {a=4, b=2, c=1}
	    }



}
