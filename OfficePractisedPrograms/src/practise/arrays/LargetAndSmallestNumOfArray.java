package practise.arrays;

import java.util.Arrays;

public class LargetAndSmallestNumOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,3,4,5,8};
		
	System.out.println("Max & second Min of Array : "+Arrays.toString(secMinAndMaxElementsOfArray(arr)));	
	System.out.println("Max Min of Arrays : "+Arrays.toString(minMaxNumbersOfArray(arr)));
		
	}

	private static int[] minMaxNumbersOfArray(int[] arr) {
		
		int max =Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {	
			 min = Math.min(min, arr[i]);
			 max = Math.max(max, arr[i]);
		}
	return new int[] {min, max};
	}
	
	
	private static int[] secMinAndMaxElementsOfArray(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			max = Math.max(max, arr[i]);
			
			if(arr[i]<=min) {
				secMin = min;
				min = arr[i];
			}else if(arr[i] < secMin && arr[i] != min) {
				secMin = arr[i];
			}			
		}
		
		
		return new int[] {secMin, max};
	}

}
