package practise.string;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
	
	public static void main(String[] args) {
		
		String str = "aabacdefab";
		
	System.out.println("longest subStr : "+longestSubStrWithoutReapting(str));
}

	private static String longestSubStrWithoutReapting(String str) {

		int right=0;
		List<Character> list = new ArrayList<>();
		int maxLength =0;
		int startIndex = 0;

		for(int left=0;left<str.length();left++) {
			char ch = str.charAt(left);	
			if(!list.contains(ch)) {
				list.add(ch);		
				if(maxLength<(left-right)+1) {
					maxLength = (left-right)+1;
					startIndex = right;
				}
			}else {
				while (list.contains(ch)) {
					list.remove(0); // Remove the first character in the list
					right++;        // Move the right pointer forward
				}
				list.add(ch);
			}
		}
		return str.substring(startIndex, startIndex+maxLength);
	}

}
