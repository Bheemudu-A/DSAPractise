import java.util.HashMap;
import java.util.Map;

public class MakingAnagram {

	
	/*
	 * need to print how many steps required to make string anagram
	 *
	 */
	
	public static void main(String[] args) {
		
	System.out.println("num of steps required : "+stepsReqtoMakeAnagram("rat", "trr"));
	System.out.println("using Arrays : "+stepsToMakeAnagramUsingArrays("rat", "trr"));
	}

	private static int stepsReqtoMakeAnagram(String string, String string2) {
		
		Map<Character, Integer> targetStr = new HashMap<>();
		Map<Character, Integer> normalMap = new HashMap<>();
		
		for(int i=0;i<string.length();i++) {
			targetStr.put(string.charAt(i), targetStr.getOrDefault(string.charAt(i), 0)+1);
		}
		
		for(int i=0;i<string2.length();i++) {
			normalMap.put(string2.charAt(i), normalMap.getOrDefault(string2.charAt(i), 0)+1);
		}
		
		
		int steps =0;
		for(char letter : targetStr.keySet()) {
			
			int targetStrCount = targetStr.get(letter);
			int normalStrCouunt  = normalMap.getOrDefault(letter, 0);			
			steps += Math.abs(targetStrCount-normalStrCouunt);			
			normalMap.remove(letter);//deleting key as we need to calculate remaining values of normalMap in next step		
		}
		
		for(char letter:normalMap.keySet()) {
			steps += normalMap.get(letter);
		}
		
		return steps;
	}
	
	private static int stepsToMakeAnagramUsingArrays(String s1, String s2) {
		
		int[] freqS1 = new int[26];
		int[] freqS2 = new int[26];
		int steps =0;
		
		for(char ch1 : s1.toCharArray()) {
			freqS1[ch1-'a']++;
		}
		
		for(char ch2 : s2.toCharArray()) {
			freqS2[ch2-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			steps += Math.abs(freqS1[i]-freqS2[i]);
			
		}
		return steps;
	}
}
