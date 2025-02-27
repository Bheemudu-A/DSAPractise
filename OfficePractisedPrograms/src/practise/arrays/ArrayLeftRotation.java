package practise.arrays;

import java.util.Arrays;

/*
 * moves 1st k elements end of array
 */
public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of rotations

        int[] result = rotateLeft(nums, k);

        System.out.println("Left Rotated Array: " + Arrays.toString(result));
    }

    public static int[] rotateLeft(int[] nums, int k) {
    	
    	int l = nums.length;
    	k=k%l;
    	
    	
    	swapArray(nums, 0, l-1); //swap total array now - [7, 6, 5, 4, 3, 2, 1]
    	swapArray(nums, 0, k); //left array swaps 0 to k elements - [4, 5, 6, 7, 3, 2, 1]
    	swapArray(nums, k+1, l-1); //swaps from k  to end of array - [4, 5, 6, 7, 1, 2, 3]
    	    	
    	return nums;
    }

	private static void swapArray(int[] nums, int left, int right) {
		while(left<right) {
			int temp = nums[right];
			nums[right] = nums[left];
			nums[left] = temp;
			left++;
			right--;
		}
	}

   
}

