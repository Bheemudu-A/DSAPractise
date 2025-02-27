package practise.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoveZeroesToEndInArray {
	
	public static void main(String[] args) {
		int[] nums = {1,0,2,3,4,0};
//	System.out.println("moving zeros to end : "+Arrays.toString(moveZerosToEnd(nums)));
	
	int[] result =	 IntStream.concat(Arrays.stream(nums).filter(i -> i!= 0), Arrays.stream(nums).filter( i -> i==0)).toArray();
	
	//below is to work with list
//	List<Integer>	resultList =Stream.concat(list.stream().filter(n -> n!=0), list.stream().filter(n -> n == 0)).collect(Collectors.toList());
		
		System.out.println("array after moving 0 to end : "+Arrays.toString(result));
	}

	private static int[] moveZerosToEnd(int[] nums) {

		int length = nums.length;
		int index = 0;

		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}		
		}
		
		while(index < length) {
			nums[index++] = 0;
		}
		return nums;
	}
	
	

}
