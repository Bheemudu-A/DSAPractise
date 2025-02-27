package practise.arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.print("Sorted array using normal way : "+Arrays.toString(sortedArr(nums)));
        
        System.out.println("Sorted array : "+Arrays.toString(sortColors(nums)));
       
    }
    
    
    private static int[] sortedArr(int[] nums) {
    	
    	for(int i=0;i<nums.length;i++) {
    		for(int j=1;j<nums.length;j++) {
    			if(nums[j] < nums[j-1]) {
    				int temp = nums[j];
    				nums[j] = nums[j-1];
    				nums[j-1] = temp;
    			}    			
    		}
    	}
    	return nums;
    }
    
    /* binary search
     * for(int i=0;i<nums.length-1;i++) {
    		for(int j=0;j<nums.length-i-1;j++) {
    			if(nums[j] > nums[j+1]) {
    				int temp = nums[j];
    				nums[j] = nums[j+1];
    				nums[j+1] = temp;
    			}    			
    		}
    	}
     */
    
    
    
    

    public static int[] sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid] and increment low, mid
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid forward
                mid++;
            } else {
                // Swap nums[mid] and nums[high] and decrement high
                swap(nums, mid, high);
                high--;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

