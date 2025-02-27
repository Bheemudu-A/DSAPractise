package dynamicprogamming;

import java.util.Arrays;
/*
 * Dynamic program to print no.of 
 */
public class LongestSubSequenceFrequency {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 9, 2, 5, 3, 7, 101, 18}; //{0,1,2,4,7,7,8,9,10,12,11}; op: 9
		
	System.out.println("maxLength : "+findLongestSequence(arr));
	}

	private static int findLongestSequence(int[] arr) {
		
		int[] temp = new int[arr.length];
		Arrays.fill(temp, 1);
		
		int maxLen =0;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					temp[i] = Math.max(temp[i], temp[j]+1);//to increase count +1 each time when nums[i] > nums[j]
				}
			}

			maxLen = Math.max(maxLen, temp[i]);
		}
		System.out.println("temp : "+Arrays.toString(temp));
		return maxLen;
	}

}
