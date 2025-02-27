package practise.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemovingDuplicateCharsfromString {
	
	public static void main(String[] args) {
		
		String str = "bheemudu";
		
	System.out.println("unique chars : "+removingDupChars(str));
	System.out.println("using int[] : "+printUniqueChar(str));
	}

	private static String removingDupChars(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		StringBuffer buffer = new StringBuffer();
		
		for(char ch : map.keySet()) {
			if(map.get(ch)==1) {
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}
	
private static String printUniqueChar(String str) {
		
		int[] freq = new int[26];
		
		for(char ch: str.toCharArray()) {	
			freq[ch-'a']++;			
		}
		
		
		
		StringBuffer buffer = new StringBuffer();
		for(char ch: str.toCharArray()) {
			if(freq[ch-'a']==1) {
				buffer.append(ch);
			}
		}
		
		
		return buffer.toString(); //list.toString();
	}

}
