package practise.arrays;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
	System.out.println("revsed Array : "+Arrays.toString(revesingArray(arr)));
	}

	private static int[] revesingArray(int[] arr) {

		int i=0;
		int j=arr.length-1;

		while(i<j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}

		return arr;
	}

}
