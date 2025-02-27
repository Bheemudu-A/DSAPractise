package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysEven {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6,3};
		
			List<Integer> list = Arrays.stream(arr).filter(a -> a%2==0).boxed().collect(Collectors.toList());
			System.out.println("even numbers : "+list);
			
			List<Integer> sortedArray = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
			System.out.println("sorted Array : "+sortedArray);
			
			
	int[] Sarr	=	Arrays.stream(arr).boxed().filter(i -> i%2==0).mapToInt(Integer::intValue).toArray();
		System.out.println("Even arr : "+Arrays.toString(Sarr));
	}
}
