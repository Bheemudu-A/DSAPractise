package practise.string;

import java.util.HashMap;
import java.util.Map;

public class Balloons {
	
	public static void main(String[] args) {
		
	String str = "loonbalxballpoon";
	System.out.println("no of balloon texts : "+noOfBalloons(str));
	}

	private static int noOfBalloons(String str) {		
		
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		map.put('l', map.getOrDefault('l',0)/2);
		map.put('o', map.getOrDefault('o',0)/2);
		
		int minLen =Integer.MAX_VALUE;
		for(char ch :"balon".toCharArray()) {
			minLen = Math.min(ch, map.getOrDefault(ch, 0));			
		}
		return minLen;
	}

}
