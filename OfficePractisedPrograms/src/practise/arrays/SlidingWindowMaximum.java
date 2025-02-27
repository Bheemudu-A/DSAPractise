package practise.arrays;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
	
	public static void main(String[] args) {
		
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		
	System.out.println("max elements of windows : "+maxElementsOfWindow(nums, k));
	}

	private static List<Integer> maxElementsOfWindow(int[] nums, int k) {	
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<nums.length-k+1;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++) {
				max = Math.max(max, nums[j]);	
			}
			list.add(max);
		}
		
		return list;
	}
	
	

}
