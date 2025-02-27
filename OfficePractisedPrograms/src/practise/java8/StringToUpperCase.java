package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Python");
		//toLowerCase
	List<String> uppercaseList =	list.stream().map(String::toUpperCase).collect(Collectors.toList());
	
	List<Integer> lengthofVariables =	list.stream().map(String::length).collect(Collectors.toList());
	
	System.out.println(uppercaseList+" "+lengthofVariables);
	}

}
