package practise.string;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
	
	public static void main(String[] args) {
		String word = "leetcode";

		List<String> dictionary = Arrays.asList("leet", "code");
		System.out.println("is breaked word contains in string : "+doesWordbreakContainsInDictonary(word, dictionary));

	}

	private static boolean doesWordbreakContainsInDictonary(String word, List<String> dictionary) {

		int n = word.length();

		boolean[] dp = new boolean[n+1];
		dp[0] =true;

		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {						
				if(dp[j] && dictionary.contains(word.substring(j, i))) {//dp[j] is mandatory trace provided in below comments
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
	}

}

 /*
  * Start with dp[0] = true (base case).
	For i = 4:
	Substring word[0...3] = "leet" exists in the dictionary, and dp[0] = true.
	Set dp[4] = true (prefix word[0...3] is valid).
	For i = 8:
	Substring word[4...7] = "code" exists in the dictionary, and dp[4] = true.
	Set dp[8] = true.
	Final value of dp[n] = dp[8] = true.

*/
