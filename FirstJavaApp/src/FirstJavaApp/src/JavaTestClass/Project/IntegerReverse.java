package FirstJavaApp.src.JavaTestClass.Project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class IntegerReverse {
    public static void main(String[] args) {
    	
  /*  	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Number");
    	int num = sc.nextInt();
    	int ans = 0;
    	while(num>0) {  		
    		int rem = num%10;
    		num = num/10;
    		ans = ans*10+rem;  		
    	}
    	System.out.println("ans : "+ans);
    	
System.out.println("addition : "+add(-10,6));*/
    	
    	System.out.println("Streams practise : "+usingStreams());
    }
    
   protected static int add(int num1, int num2) {
	   if(num2 == 0) {
		   return num1;
	   }
	   return add(num1 ^ num2, (num1 & num2)<<1);
   }
   
   protected static Stream<String> usingStreams() {
	   
	   List<String> names = Arrays.asList("bheem", "koushika", "Ramesh", "Srinivas", "Nagraj", "bharath", "bhanu");
	  
	   
	   Stream<String> output = names.stream();
	   System.out.println("Names");
	   output.forEach(System.out::println);
	   
	   Stream<String> prefixFilter = names.stream().filter(name -> name.startsWith("b"));
	   System.out.println("result filter");
	   prefixFilter.forEach(System.out::println);
	   
	   Stream<Integer> lengthFilter = names.stream().map(String::length);
	   System.out.println("lengthFilter filter");
	   lengthFilter.forEach(System.out::println);
	   
	   String concatenatedNames = names.stream()
			   .reduce("", (a, b) -> a + " " + b);
	   System.out.println("concatenatedNames : "+concatenatedNames);
	   
	   Stream<String> sorted = names.stream().sorted();
	   System.out.println("Sorted Stream");
	   sorted.forEach(System.out::println);
	   
	// Stream pipeline: filter, map, sort, and collect
       List<String> result = names.stream()
                                  .filter(name -> name.startsWith("b")) // Intermediate operation
                                  .map(String::toUpperCase).map(String::toLowerCase)             // Intermediate operation
                                  .sorted()                              // Intermediate operation
                                  .collect(Collectors.toList());   
	   System.out.println("result : "+result);
	   
	   System.out.println("Integer Stream started");
	   
	   List<Integer> list = Arrays.asList(1,2,3,4,5,10,7,9,8);
	   list.stream().sorted().filter(n -> n%2==1).map(n -> n*2).forEach(n -> System.out.println(n));
	   
	return output;
	   
   }
}