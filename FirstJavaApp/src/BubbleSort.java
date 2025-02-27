import java.util.Arrays;


/*
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, 
 * compares adjacent elements, and swaps them if they are in the wrong order. 
 * This process is repeated until the list is sorted. It's called "Bubble Sort" because smaller elements "bubble" to the top (beginning) of the list.

 */

/*
 * Merge Sort: is a divide-and-conquer algorithm that splits an array into smaller subarrays, sorts them, 
 * and then merges them back together to produce a sorted array. 
 * It is a stable sorting algorithm and works efficiently for large datasets.
 */

//this is bubble sort example
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr  = {2,5,3,4,1,9};
		
	System.out.println("sorted array : "+Arrays.toString(sortArrayUsingBubbleSort(arr)));
		
	}

	private static int[] sortArrayUsingBubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-1-i;j++) {			
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		return arr;
	}

}
