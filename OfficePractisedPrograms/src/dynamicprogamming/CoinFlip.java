package dynamicprogamming;

import java.util.Arrays;

public class CoinFlip {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 3, 5, 1, 2, 9};
	System.out.println("maxWin : "+maxWin(arr));
	System.out.println("maxWin using array : "+maxWinUsingArray(arr));
	}
	
	public static int maxWinUsingArray(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        
        // DP table where dp[i][j] stores the maximum coins the first player can win from arr[i] to arr[j]
        int[][] dp = new int[n][n];
        
        // Base case: when there's only one coin, the first player picks it
        for (int i = 0; i < n; i++) {
            dp[i][i] = arr[i];
        }
        
        // Fill the DP table for subarrays of length 2 to n
        for (int length = 2; length <= n; length++) { // length of the subarray
        	for (int i = 0; i <= n - length; i++) {
        		int j = i + length - 1; // End of the subarray

        		// Recurrence relation: pick the maximum between left or right coin
        		int pickLeft = arr[i] + Math.min(i + 2 <= j ? dp[i + 2][j] : 0, i + 1 <= j - 1 ? dp[i + 1][j - 1] : 0);
        		int pickRight = arr[j] + Math.min(i <= j - 2 ? dp[i][j - 2] : 0, i + 1 <= j - 1 ? dp[i + 1][j - 1] : 0);

        		dp[i][j] = Math.max(pickLeft, pickRight);
        	}
        }
        
        // The result for the whole array is stored in dp[0][n-1]
        return dp[0][n - 1];
    }
	
	//getting correct answer but approach is wrong
	private static int maxWin(int[] arr) {

		Arrays.sort(arr);
		int maxWin =0;
		int minWin =0;

		for(int i=1;i<arr.length;i+=2) {

			maxWin += Math.max(arr[i], arr[i-1]);
			minWin += Math.min(arr[i], arr[i-1]);

		}
		System.out.println("minWin : "+minWin);
		return maxWin;
	}

}
