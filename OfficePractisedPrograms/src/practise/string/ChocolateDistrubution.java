package practise.string;

import java.util.Arrays;

public class ChocolateDistrubution {
	
	
	/*
	 * ⦁	Chocolate Distribution Problem
Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:  Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:
Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 	Output: Minimum Difference is 2 
Explanation:	We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 	Output: Minimum Difference is 6 
Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7 	Output: Minimum Difference is 10
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int m = 5;
		
	System.out.println("minim diff : "+minimumDiff(arr, m));
	}

	private static int minimumDiff(int[] arr, int m) {
		
		if(arr.length<m) {
			return -1;
		}
		
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;	
		
		for(int i=0;i<arr.length-m+1;i++) {
			int diff = arr[i+m-1]-arr[i];
			minDiff = Math.min(minDiff, diff);
		}
		
		return minDiff;
	}

}
