package practise.string;

import java.util.HashMap;
import java.util.Map;


/*
 * ⦁	Longest Repeating Substring With Replacement : You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character. After performing at most k replacements, return the length of the longest substring which contains only one distinct character.
Example 1: 	Input: s = "XYYX", k = 2		Output: 4
Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.
Example 2:	Input: s = "AAABABB", k = 1		Output: 5
Constraints:	1 <= s.length <= 1000	0 <= k <= s.length
 */

public class LongestReaptingString {
	
	public static void main(String[] args) {
		
		String str ="XYYX";  //s = "AAABABB", k = 1	
		int k =2;
		
	System.out.println(characterReplacement(str, k));
	}

	
	
	public static int characterReplacement(String s, int k) {
		int maxLength = 0;
		int left = 0;
		int maxFreq = 0;
		Map<Character, Integer> freqMap = new HashMap<>();

		for (int right = 0; right < s.length(); right++) {
			char rightChar = s.charAt(right);
			freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
			maxFreq = Math.max(maxFreq, freqMap.get(rightChar));

			// Window size is (right - left + 1)
			if ((right - left + 1) - maxFreq > k) {
				// Shrink the window
				char leftChar = s.charAt(left);
				freqMap.put(leftChar, freqMap.get(leftChar) - 1);
				left++;
			}

			// Update maximum length of the valid window
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}


}
