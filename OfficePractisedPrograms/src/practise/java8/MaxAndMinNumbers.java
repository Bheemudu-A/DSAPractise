package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,8,2,3,4,10,9,-2);
		
		//we can use orElseThrow or get in this case
		int max = list.stream().max(Integer::compare).orElseThrow();
		int min = list.stream().min(Integer::compare).get();
		
		
		//unique elements
		List<Integer> distint = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(max+" "+min);
		
		System.out.println(distint);
	}

}
