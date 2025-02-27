package practise.arrays;

import java.util.Arrays;

/*
 * moves last k elements to start of array
 */
public class ArrayRightRotation {
	
	public static void main(String[] args) {
		
		int[] sortedArray = {1,2,3,4,5,6,7};
		
		int k=3;
		
	System.out.println("Right Rotation of Array : "+Arrays.toString(arrayRightRotation(sortedArray, k)));
		
		
	}

	private static int[] arrayRightRotation(int[] sortedArray, int k) {
		int l = sortedArray.length;
		//	k = k%l;


		swapElements(sortedArray, 0, l-1); // swaps hole array [7, 6, 5, 4, 3, 2, 1] to move last elements to start of array
		swapElements(sortedArray, 0, k-1); // swaps elements upto k - [5, 6, 7, 4, 3, 2, 1]
		swapElements(sortedArray, k, l-1); // now swap elements from k to total length (l) -  [5, 6, 7, 1, 2, 3, 4]

		return sortedArray;	
	}

	private static void swapElements(int[] sortedArray, int left, int right) {		
		while(left<right) {			
			int temp = sortedArray[right];
			sortedArray[right] = sortedArray[left];
			sortedArray[left] = temp;	
			left++;
			right--;
		}		
	}	
	
/*	private static int[] arrayRightRotation(int[] sortedArray, int k){
		
		int l = sortedArray.length;
		
		swap(sortedArray, 0, k);
		swap(sortedArray, k+1, l-1);
		swap(sortedArray, 0, l-1);
	
		return sortedArray;
	}
	
	private static void swap(int[] sortedArray, int start, int end){
		
		while(start<end){
			int temp = sortedArray[start];
			sortedArray[start] = sortedArray[end];
			sortedArray[end] = temp;
			start++;
			end--;
		}
		
	}*/

}
