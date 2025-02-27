package practise.arrays;

import java.util.Arrays;

/*
 * The "Next Permutation" problem involves rearranging the array of integers into the next lexicographically greater permutation of numbers.
 *  If such an arrangement is not possible (e.g., the array is sorted in descending order), 
 *  the array should be rearranged to the smallest permutation (sorted in ascending order).
 */

public class NextPermutation {
	
	public static void main(String[] args) {

		int[] arr = {1,2,3};
		System.out.println("next permutation arr "+ Arrays.toString(findNextPermutationofArray(arr)));
	}

	private static int[] findNextPermutationofArray(int[] arr) {		
		int i = arr.length-2;
		
		while(i>=0 && arr[i] >= arr[i+1]) {
			i--;
		}
		
		if(i>=0) {
			int j = arr.length-1;			
			while(arr[j] <= arr[i]) {
				j--;
			}			
			swap(arr, i, j);
		}		
		reverse(arr, i + 1, arr.length - 1);
		
		return arr;
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}	
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	
	

}
