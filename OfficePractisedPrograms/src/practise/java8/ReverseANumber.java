
package practise.java8;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int num = 2345;
		
		String nums = String.valueOf(num);
		
	//my own logic	
	nums.chars().mapToObj(i -> (char)i).sorted(Collections.reverseOrder()).map( i -> i-'0').forEach(System.out::print);
	
	//best
	String reversedStr = IntStream.rangeClosed(0, nums.length()-1)
            .mapToObj(i -> nums.charAt(nums.length() - i - 1))
            .map(String::valueOf)
            .collect(Collectors.joining());
	
	int revNum = Integer.parseInt(reversedStr);
	
	System.out.println(" 2nd way : "+reversedStr+" revNum : "+revNum);
	}
	
	public static int reverseNumber(int num) {
	    String nums = String.valueOf(num);
	    String reversedStr = IntStream.range(0, nums.length())
	            .mapToObj(i -> nums.charAt(nums.length() - i - 1))
	            .map(String::valueOf)
	            .collect(Collectors.joining());
	    return Integer.parseInt(reversedStr);
	}

}
