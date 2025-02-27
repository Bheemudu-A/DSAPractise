package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,2,5,4);
	System.out.println("removed duplicates with insertion presevation: "+removeDuplicates(list));
	}

	private static List<Integer> removeDuplicates(List<Integer> list) {		
		Set<Integer> set = new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}

}
