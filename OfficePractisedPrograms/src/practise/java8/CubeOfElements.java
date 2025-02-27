package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> result =	list.stream().map(i -> i*i*i).filter(i -> i>50).collect(Collectors.toList());
		
	//	we can also do using inbuilt function Math.pow()
	//	List<Integer> result =	list.stream().map(i -> (int)Math.pow(i, 3)).filter(i -> i>50).collect(Collectors.toList());
		System.out.println("List : "+result);
		
		
		//finding cubes of Arrays
		int[] arr = {1,2,3,4};
		 
		int[] result1 =  Arrays.stream(arr).map(i -> (int)Math.pow(i, 3)).toArray();
														//Collections.reverseOrder() --we can also use it
		int[] intArr = Arrays.stream(arr).boxed().sorted((a,b) -> (b-a)).mapToInt(Integer :: intValue).toArray();
		
		//to convert to Integer Array
		/*
		Integer[] sortedDescending = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> (b - a))
                .toArray(Integer[]::new);
                */
		
		System.out.println("result : "+Arrays.toString(result1)+" descending Order Arr : "+Arrays.toString(intArr));
	}
	
}
