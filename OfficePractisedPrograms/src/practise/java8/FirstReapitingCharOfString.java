package practise.java8;

import java.util.HashSet;
import java.util.Set;

public class FirstReapitingCharOfString {
	
	public static void main(String[] args) {
		
		String str = "bheemudu";
		
		Set<Character> set = new HashSet<>();
		
		str.chars().mapToObj( i -> (char)i).filter(c -> !set.add(c)).findFirst().ifPresent(System.out::println);
	}

}
