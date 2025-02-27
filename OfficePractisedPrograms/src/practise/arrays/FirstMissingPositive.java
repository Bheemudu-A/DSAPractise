package practise.arrays;

import java.util.Arrays;

/*
 * Given an unsorted integer array, find the smallest missing positive integer.
 */
public class FirstMissingPositive {
	
	public static void main(String[] args) {
		int[] nums = {3, 4, -1, 1,2,7};
		System.out.println("First Missing Positive: " + firstMissingPositive(nums)); // Output: 2
		System.out.println("own way : " +findFisrtMissingPositive(nums));
	}

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
        	while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
        		swap(nums, i, nums[i] - 1);
        	}
        }

       System.out.println( Arrays.toString(nums));
        
        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers are in the correct position, return n + 1
        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    //own way
    private static int findFisrtMissingPositive(int[] nums){    	
    	Arrays.sort(nums);
 
    	for (int i = 0; i < nums.length-1; i++) {
            // Skip numbers that are not positive or duplicates
            if (nums[i] <= 0 || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }

            // If we find a number that is not equal to i + 1, return i + 1
            if (nums[i]+1 != nums[i+1]) {
                return nums[i] + 1;
            }
        }
    	return nums.length+1;
    }
    
    

}

