package practise.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacterOfString {
	
	public static void main(String[] args) {
		
		String str = "abcdaedc";
		
	System.out.println("unique chars of str : "+printUniqueChar(str));
	}

	private static String printUniqueChar(String str) {
		
		int[] freq = new int[26];
		List<Character> list = new ArrayList<>();
		
		for(char ch: str.toCharArray()) {	
			freq[ch-'a']++;			
		}
		
		
		for(char ch: str.toCharArray()) {
			if(freq[ch-'a']==1) {
				list.add(ch);
			}
		}
		
		String uniqStr = "";
		for(char ch : list) {
			uniqStr += ch;
		}
		return uniqStr; //list.toString();
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

}
