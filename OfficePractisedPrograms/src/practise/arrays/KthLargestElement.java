package practise.arrays;

import java.util.Arrays;

public class KthLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,5,2,7,7,5,6,9};
		
	System.out.println("third Max : "+findThirdmaxOfArray(arr));
	}

	private static int findThirdmaxOfArray(int[] arr) {

		//	Arrays.sort(arr);

		int max =0;
		int secMax = 0;
		int thirdMax =0;

		for(int i=0;i<arr.length;i++) {

			if(arr[i]>max) { //use arr[i]>=max if you want to consider equal elements also
				thirdMax = secMax;
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax && arr[i] != max) {
				thirdMax = secMax;
				secMax = arr[i];
			}else if(arr[i] > thirdMax && arr[i] != secMax) {
				thirdMax = arr[i];
			}
		}
		System.out.println("secMax : "+secMax+" max : "+max);
		return thirdMax;
	}
	
	
	public int secondHighest(int[] nums) {
		 int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
		 for (int num : nums) {
		 if (num > highest) {
		 secondHighest = highest;
		 highest = num;
		 } else if (num > secondHighest && num != highest) {
		 secondHighest = num;
		 }
		 }
		 return secondHighest;
		}

}
