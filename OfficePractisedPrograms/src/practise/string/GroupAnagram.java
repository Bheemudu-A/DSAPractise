package practise.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		
		String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
	System.out.println("group of anagrams : "+groupsimilarAnagram(strArr));
	}

	private static List<List<String>> groupsimilarAnagram(String[] strArr) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str: strArr) {
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			String sortedStr = new String(chArr);
			if(!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(str);
		}
		return new ArrayList<List<String>>(map.values());//we can also print it as new ArrayList<>(map.values());
	}
}
