package practise.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Find the majority element in an array (element appearing more than n/2 times).
 */
public class MajorityElement {
	
	public static void main(String[] args) {
		
		 int[] nums = {2, 2, 1, 1, 2, 2, 2,5,5,5,5,5,5,5,5,5};
		 
	System.out.println("Find majority of element : "+findMajorityElementUsingMap(nums));
	System.out.println("Find majority of element using own way: "+majorityFindUsingArray(nums));
	
	}

	//using map
	private static int findMajorityElementUsingMap(int[] nums) {		
		Map<Integer, Integer> map = new HashMap<>();		
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int element =0;
		int count = 0;
		
		for(int key : map.keySet()) {			
			if(map.get(key) > nums.length/2 && map.get(key) > count) {
				count = map.get(key);
				element = key;
			}
		}
		
	return element;	
	}
	
	//own way
	private static int majorityFindUsingArray(int[] nums) {
		
		Arrays.sort(nums);
		
		int count =1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				count++;
				if(count>nums.length/2) {
					return nums[i-1];
				}
			}else {
				count =1;
			}

		}
		return -1;
	}
	
	
	public static int findMajorityElement(int[] nums) {
        // Phase 1: Find the candidate for majority element
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

}
