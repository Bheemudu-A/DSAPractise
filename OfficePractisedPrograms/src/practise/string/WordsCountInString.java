package practise.string;

import java.util.HashMap;
import java.util.Map;

public class WordsCountInString {
	
	public static void main(String[] args) {
		String str = "Hello Bheem welcome to coding world Hello";
		
	System.out.println("map : "+wordsSplit(str));
	}

	private static Map<String, Integer> wordsSplit(String str) {
		
		String[] strarr = str.split(" "); //we can also use this str.split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		
		for(String st: strarr){
			map.put(st, map.getOrDefault(st, 0)+1);
		}
		return map;
	}

}
