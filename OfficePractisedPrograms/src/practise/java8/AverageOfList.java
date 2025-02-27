package practise.java8;

import java.util.Arrays;
import java.util.List;

public class AverageOfList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		double averageofList = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println(averageofList);
	
	}

}
