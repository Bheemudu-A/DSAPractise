package practise.arrays;

/*
 * The Maximum Product Subarray problem is about finding the contiguous subarray within an array of integers 
 * (which may contain negative numbers, zeros, and positive numbers) that has the largest product.
  Problem Statement
  Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest product and return the product.
 * 
 */
public class MaximumProductSubArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,-2,4};
		
	System.out.println("max product of subArray : "+maxProductOfSubArray(arr));
		
	}

	private static int maxProductOfSubArray(int[] arr) {
		
		int max = arr[0];
		int min = arr[0];
		int result = arr[0];
		int minResult = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			//if arr[i] swapping min & max
			if(arr[i]<0){
				int temp = max;
				max = min;
				min = temp;
			}
			
			max = Math.max(max*arr[i], arr[i]);
			min = Math.min(min*arr[i], arr[i]);
			
			result = Math.max(result, max);//extracting max element from previous result and with current result
			minResult = Math.min(minResult, min);
		}
		
		System.out.println("minResult : "+minResult);
		return result;
	}
}
