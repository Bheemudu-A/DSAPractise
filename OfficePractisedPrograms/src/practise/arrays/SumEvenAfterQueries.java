package practise.arrays;

import java.util.Arrays;

/*
 * You are given an integer array nums and an array of queries queries
where queries[i] = [val, index]. For each query, add val to nums[index]. Then, 
return the sum of all even numbers in nums.
 */
public class SumEvenAfterQueries {
	
	public static void main(String[] args) {
		
		 int[] nums = {1, 2, 3, 4};
	     
		 int[][] queries = {
	            {1, 0},
	            {-3, 1},
	            {-4, 0},
	            {2, 3}
	        };
		 
	System.out.println("sum of all even numbers : "+	Arrays.toString(sumEvenAfterQuery(nums, queries)));
	}

	private static int[] sumEvenAfterQuery(int[] nums, int[][] queries) {
		
		int evenSum = 0;
		
		for(int num: nums) {
			if (num % 2 == 0) {
				evenSum += num;
			}
		}
		
		int[] result = new int[queries.length];
		
		for(int i=0;i<queries.length;i++) {
			
			int val = queries[i][0];
			int index = queries[i][1];
			
			if(nums[index]%2==0) {
				evenSum -= nums[index];
			}
			
			nums[index] += val;
			
			if(nums[index]%2==0) {
				evenSum += nums[index];
			}
			result[i] = evenSum;
		}
		return result;
	}

}
