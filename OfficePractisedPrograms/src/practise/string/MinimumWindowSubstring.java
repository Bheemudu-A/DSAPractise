package practise.string;

import java.util.HashMap;
import java.util.Map;

/*
 * ⦁	Minimum Window With Characters (Combination): Given two strings s and t, return the shortest substring of s such that every character in t, including duplicates, is present in the substring. If such a substring does not exist, return an empty string "". You may assume that the correct output is always unique.
Example 1: 		Input: s = "OUZODYXAZV", t = "XYZ"		Output: "YXAZ"
Explanation: "YXAZ" is the shortest substring that includes "X", "Y", and "Z" from string t.
Example 2:		Input: s = "xyz", t = "xyz"			Output: "xyz"
Example 3:		Input: s = "x", t = "xy"				Output: ""
Constraints:	1 <= s.length <= 1000
Ex4: Input: s="aaaaaaaaaaaabbbbbcdd", t="abcdd"	Output: "abbbbbcdd" 
 */

public class MinimumWindowSubstring {
	
	
    public static String minWindow(String s, String t) {
    	
    	Map<Character, Integer> targetMap = new HashMap<>();
    	Map<Character, Integer> windowMap = new HashMap<>();
    	
    	for(char ch:t.toCharArray()) {
    		targetMap.put(ch, targetMap.getOrDefault(ch, 0)+1);
    	}
    	
    	int left =0;
    	int matchCount =0;
    	int minLength = Integer.MAX_VALUE;
    	int startIndex = 0;
    	
    	for(int right=0;right<s.length();right++) {
    		char ch = s.charAt(right);
    		windowMap.put(ch, windowMap.getOrDefault(ch, 0)+1);
    		
    		if(targetMap.containsKey(ch) && windowMap.get(ch).equals(targetMap.get(ch))){
    			matchCount++;
    		}
    		
    		while(matchCount==targetMap.size()) {
    			
    			if((right-left+1)<minLength) {
    				minLength = (right-left)+1;
    				startIndex = left;
    			}
    			
    			char leftChar = s.charAt(left);
    			windowMap.put(leftChar, windowMap.get(leftChar)-1);
    			
    			//if deleted char contains in targetMap & leftChar deleted in windowMap make matchCount--
    			if(targetMap.containsKey(leftChar) &&  windowMap.get(leftChar) < targetMap.get(leftChar)) {
    				matchCount--;
    			}
    			left++;
    		}
    	}
    	return minLength == Integer.MAX_VALUE ? "": s.substring(startIndex, startIndex+minLength);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ")); // Output: "YXAZ"
        System.out.println(minWindow("xyz", "xyz"));         // Output: "xyz"
        System.out.println(minWindow("x", "xy"));           // Output: ""
        System.out.println(minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd")); // Output: "abbbbbcdd"
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Output: "abbbbbcdd"
    }
}

