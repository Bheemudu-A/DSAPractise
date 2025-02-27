package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5,6,4,5};
		
	System.out.println("remove element : "+Arrays.toString(removeDuplicates(arr)));
		
	}

	private static int[] removeDuplicates(int[] arr) {
		
		Arrays.sort(arr);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		
		int[] sortedArr = new int[set.size()];
		
		//use enhanced for to iterate values for Set[I] implements, beacuse it doesn't have get(input) method so that normal for loop wont work 
		int i=0;
		for(int element : set) {
			sortedArr[i++] = element;
		}
		
		return sortedArr;
	}

}
