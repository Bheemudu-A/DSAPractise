package practise.string;

import java.util.HashMap;
import java.util.Map;

public class OccurancesOfChar {
	
	public static void main(String[] args) {
		
		String str = "abcedidfd";
		
	System.out.println("Map : "+occuranceOfEachChar(str));
	}

	private static Map<Character, Integer> occuranceOfEachChar(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		return map;
	}

}
