package practise.interviewPrograms;

import java.util.Arrays;

public class SortedEvenOddArr {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,3,4,6,5};
	System.out.println("sorted array in even-odd : "+Arrays.toString(evenOddSortOrder(arr)));
		
	}

	private static int[] evenOddSortOrder(int[] arr) {
		
		Arrays.sort(arr);
		
		int[] result = new int[arr.length];
		
		int index=0;
		for(int num : arr) {
			if(num%2==0)
			result[index++] = num;
		}
		
		for(int num : arr) {
			if(num%2 !=0)
			result[index++] = num;
		}
		return result;
	}

}
