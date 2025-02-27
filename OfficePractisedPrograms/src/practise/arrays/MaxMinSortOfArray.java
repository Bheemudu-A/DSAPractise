package practise.arrays;

import java.util.Arrays;

public class MaxMinSortOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,2,3,8,5,6};
	System.out.println(Arrays.toString(minMaxSortArray(arr)));
	
	
	}

	private static int[] minMaxSortArray(int[] arr) {		
		int[] newArr = new int[arr.length];
		Arrays.sort(arr);
		boolean bol = false;
		int i=0;
		int j=arr.length-1;
		int k=0;
		while(k<arr.length) {
			if(bol) {
				newArr[k++] = arr[i++];
				//	bol = false;
			}else{
				newArr[k++] = arr[j--];
				//	bol = true;
			}
			bol = !bol;
		}		
		return newArr;	
	}

}
