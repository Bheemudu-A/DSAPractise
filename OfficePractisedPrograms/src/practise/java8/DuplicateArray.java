package practise.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 11) Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct
 */
public class DuplicateArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,2,3};
		
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		 if(arr.length != set.size()) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
		
		
	}
}
