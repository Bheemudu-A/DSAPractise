package FirstJavaApp.src.JavaTestClass.Project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class StreamsPractise {
    public static void main(String[] args) { 
    	
    	practisingStringStreams();
    	practisingIntegerStreams();
    }
    
   private static void practisingIntegerStreams() {
	   List<Integer> list = Arrays.asList(1,2,3,4,5,10,7,9,8);
	   list.stream().
	   				sorted().
					filter(n -> n%2==1).
					map(n -> n*2).
					forEach(n -> System.out.println(n));
	   //adding numbers
	   
	  int output = list.stream().sorted().filter(n -> n%2==1).map(b -> b*2).reduce(0, (a,b)->a+b);
	  System.out.println("output : "+output);

	}

protected static void practisingStringStreams() {
	   
	   List<String> names = Arrays.asList("bheem", "koushika", "Ramesh", "Srinivas", "Nagraj", "bharath", "bhanu");
	  
	 //  String[] values = names.toArray(new String[0]);
	 //  converting list to array using streams
	//   String[] array = names.stream().toArray(String[]::new);
	   
	   Stream<String> output = names.stream();
	   System.out.println("Names");
	   output.forEach(System.out::println);
	   
	   Stream<String> prefixFilter = names.stream().filter(name -> name.startsWith("b"));
	   System.out.println("result filter");
	   prefixFilter.forEach(System.out::println);
	   
	   Stream<Integer> lengthFilter = names.stream().map(String::length);
	   System.out.println("lengthFilter filter");
	   lengthFilter.forEach(n -> System.out.println(n));
	   
	   String concatenatedNames = names.stream()
			   .reduce("", (a, b) -> a + " " + b);
	   System.out.println("concatenatedNames : "+concatenatedNames);
	   
	   Stream<String> sorted = names.stream().sorted();
	   System.out.println("Sorted Stream");
	   sorted.forEach(System.out::println);
	   
	
	   
   }
}