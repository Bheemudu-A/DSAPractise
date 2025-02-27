package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListForOddandEven {

	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(1,2,3,4,5,6,7,8);
		
	Map<Boolean, List<Integer>> oddEvenList = 	list.stream().collect(Collectors.partitioningBy(n -> n%2==0));
	
	System.out.println(oddEvenList);
	
	for(boolean even : oddEvenList.keySet()) {
		if(even) {
			System.out.println("Even : "+oddEvenList.get(even));
		}else {
			System.out.println("Odd : "+oddEvenList.get(even));
		}
	}
	
	
	} 
}
