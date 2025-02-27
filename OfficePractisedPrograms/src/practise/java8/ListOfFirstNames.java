package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfFirstNames {
	
	public static void main(String[] args) {
		
		List<String> fullNames = Arrays.asList("Bheemudu Avula", "Koushika Pulagam","Ramesh Balgari");
		
		List<String>  firstnames =  fullNames.stream().map(i -> i.split(" ")[0]).collect(Collectors.toList());
		
		System.out.println("first Names : "+firstnames);
		
	}

}
