package practise.arrays;

public class MaxSum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,2,3,20,4};
		int window =3;
		
	System.out.println("Window Sum : "+maxSumOfWindow(arr, window));
	}

	private static int maxSumOfWindow(int[] arr, int window) {		
		int maxSum = 0;
		int windowSum =0;
		for(int i=0;i<window;i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		for(int j =window;j<arr.length;j++) {
			windowSum = windowSum+arr[j]-arr[j-window];
			maxSum = Math.max(windowSum, maxSum);	
		}
		return maxSum;
	}
}
