package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllOddnumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
	    int sumofoddnum =	list.stream().filter(i -> i%2 !=0).
	    								  reduce(0, Integer::sum);
	 
	System.out.println(sumofoddnum);
	
	}

}
