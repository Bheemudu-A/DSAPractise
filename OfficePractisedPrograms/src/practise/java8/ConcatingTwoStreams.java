package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatingTwoStreams {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6,7);
		
		       List<Integer>  concatedStream  =  Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		           
		    //   List<Integer> list = concatedStream.collect(Collectors.toList());
		       System.out.println("concatedStream : "+concatedStream);
		       
		       int[] a1 = {1,2,3};
		       int[] a2 = {4,5,6};
		       
		       //integer Array
		    Integer[] concatedArray = Stream.concat(Arrays.stream(a1).boxed(), Arrays.stream(a2).boxed()).toArray(Integer[]::new);
		    
		 int[] combinedArr = Stream.concat(Arrays.stream(a1).boxed(), Arrays.stream(a2).boxed()).mapToInt(Integer::intValue).toArray();
		 	
		 System.out.println("combinedArr : "+Arrays.toString(combinedArr));
		 
	}

}
