package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfLists {

	public static void main(String[] args) {
		
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5), Arrays.asList(7));
	
			List<Integer> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());			
			System.out.println(flatList);
	}
}
