package practise.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class indecesOfAnagramElements {
	
	public static void main(String[] args) {
		
		String[] arr = {"listen", "silent", "enlist", "abc", "cba", "bca"};
		
	System.out.println("Mapping Anagaram element indexes : "+indexesOfAnagrams(arr));
	}

	private static Map<String, List<Integer>> indexesOfAnagrams(String[] arr) {
		
		Map<String, List<Integer>> map = new HashMap<>();
		
		int i=0;
		for(String str : arr) {
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			String sortedStr = new String(chArr);
			
			if(!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(i);
			i++;		
		}
		
		
		return map;
	}

}
