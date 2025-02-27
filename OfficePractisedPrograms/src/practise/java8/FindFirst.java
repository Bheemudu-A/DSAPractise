package practise.java8;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,4,6,2,1);
		
		list.stream().findFirst().ifPresent(System.out::print);
		
		//to find size of stream
		long count =list.stream().count();
		System.out.println("count : "+count);
		
		//for arrays we can user Arrays.stream(arr).count.boxed().collect(Collectors.toList());
	}

}
