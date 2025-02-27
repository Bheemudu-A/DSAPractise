package practise.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Evennumbers {
	
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
	//print Even numbers
	List<Integer> evenList =	list.stream().filter(a -> a%2==0).collect(Collectors.toList());
	System.out.println(evenList);
	
	int[] arr = list.stream().filter(a -> a%2==0).mapToInt(Integer::intValue).toArray();
	
	System.out.println("arr : "+Arrays.toString(arr));
	
	//sum of even numbers
	int sumOfEvenNumbers = list.stream().filter(n -> n%2 ==0).reduce(0, (a,b) -> (a+b));
	System.out.println("Sum Of even Numbers : "+sumOfEvenNumbers);
	
	
	//removing null from arrayList
	List<String> ll = Arrays.asList("java", "python", null, "spring");
	List<String> newLL = ll.stream().filter(words -> words!= null).collect(Collectors.toList());
	
	System.out.println("After removing null : "+newLL);
	
	}

}
