package practise.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static void main(String[] args) {
		
		String str1 = "mission";
		String str2 = "ionissm";
		
	System.out.println("is given strings are empty using map : "+checkWhetherGivenOrAnagram(str1, str2));
	System.out.println("using charArr : "+usingCharArr(str1, str2));
	System.out.println("usingIntArray : "+usingIntArray(str1, str2));
	}

	//using map
	private static boolean checkWhetherGivenOrAnagram(String str1, String str2) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : str2.toCharArray()) {	
			if(map.containsKey(ch)) {
				if(map.get(ch)==1) {
					map.remove(ch);
				}else {
					map.put(ch, map.get(ch)-1);
				}	
			}else {
				return false;
			}
		}
		return map.isEmpty();
	}
	
	//using char Array
	private static boolean usingCharArr(String str1, String str2) {		

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		if(charArr1.length != charArr2.length) {
			return false;
		}

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		for(int i=0;i<charArr1.length;i++) {			
			if(charArr1[i] != charArr2[i]) {
				return false;
			}
		}

		return true;
	}
	
	private static boolean usingIntArray(String str1, String str2) {

		int[] arr1 = new int[26];
		
		for(char ch : str1.toCharArray()) {
			arr1[ch-'a']++;
		}

		for(char ch: str2.toCharArray()) {
			arr1[ch-'a']--;
		}

		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != 0) {
				return false;
			}
		}

		return true;
	}
	

}
