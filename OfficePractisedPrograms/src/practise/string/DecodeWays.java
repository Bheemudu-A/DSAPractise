package practise.string;

/*
 * The Decode Ways problem is about determining how many different ways a string 
 * of digits can be decoded into letters, where 'A' = 1, 'B' = 2, ..., 'Z' = 26'.
 * 
 */

/*
 * explanation: "226" can be decoded as 1. "BZ"(2 26) 2. "VF"(22 6) 3. "BBF" (2 2 6)  exp:op 3
 */
public class DecodeWays {
	
	public static void main(String[] args) {
		
		String str = "226";
		
	System.out.println("num of ways to decode string : "+numOfPossibleDecodeWays(str));
		
	}

	private static int numOfPossibleDecodeWays(String str) {
		
		int n = str.length();		
		int[] dp = new int[n+1];	  
		dp[0] =1;
		
		dp[1] = str.charAt(0)!= '0'?1:0;
		
		for(int i=2;i<=str.length();i++) {
			
			int oneDigit = Integer.parseInt(str.substring(i-1, i));
			if(oneDigit>= 0 && oneDigit <= 9) {
				dp[i] += dp[i-1];
			}
			
			int twoDigit = Integer.parseInt(str.substring(i-2, i));
			if(twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i-2];
			}
			
		}
		
	 return dp[n];	
	}
	
	
	/*
	 * trace:
	 * 
	 * Input: s = "226"
			Initialization
			Length of s: n = 3
			dp array: dp = [0, 0, 0, 0] (size n+1)
			Base case:
			dp[0] = 1 (empty string has one way to decode)
			dp[1] = 1 (since s.charAt(0) = '2' is valid and not 0)
			Initial dp Array
			plaintext
			Copy code
			dp = [1, 1, 0, 0]
			Loop Iteration
			Iteration 1 (i = 2):
			Substring considered: s.substring(1, 2) = "2" (single digit)
			
			oneDigit = 2 (valid single digit: 1 <= 2 <= 9)
			Update: dp[2] += dp[1] => dp[2] = 1
			Substring considered: s.substring(0, 2) = "22" (two digits)
			
			twoDigits = 22 (valid double digit: 10 <= 22 <= 26)
			Update: dp[2] += dp[0] => dp[2] = 2
			dp Array After Iteration:
			
			plaintext
			Copy code
			dp = [1, 1, 2, 0]
			Iteration 2 (i = 3):
			Substring considered: s.substring(2, 3) = "6" (single digit)
			
			oneDigit = 6 (valid single digit: 1 <= 6 <= 9)
			Update: dp[3] += dp[2] => dp[3] = 2
			Substring considered: s.substring(1, 3) = "26" (two digits)
			
			twoDigits = 26 (valid double digit: 10 <= 26 <= 26)
			Update: dp[3] += dp[1] => dp[3] = 3
			dp Array After Iteration:
			
			plaintext
			Copy code
			dp = [1, 1, 2, 3]
			Final dp Array
			plaintext
			Copy code
			dp = [1, 1, 2, 3]

	 */

}
