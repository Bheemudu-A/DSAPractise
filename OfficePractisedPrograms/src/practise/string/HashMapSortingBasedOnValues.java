package practise.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingBasedOnValues {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(101, 5);
		map.put(106, 3);
		map.put(109, 6);
		map.put(1, 2);
		map.put(5, 9);
		
	System.out.println("sorted based on values : "+sortingMapBasedOnValues(map));
	
	System.out.println("map sorted using java8 : "+usingJava8Streams(map));
		
	}
	
	private static Map<Integer, Integer> sortingMapBasedOnValues(Map<Integer, Integer> map) {

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		//		list.addAll(map.entrySet()); we can add like this also
		list.sort(Map.Entry.comparingByValue());

		Map<Integer, Integer> llhasmap = new LinkedHashMap<Integer, Integer>();

		for(Map.Entry<Integer, Integer> itr : list) {
			llhasmap.put(itr.getKey(), itr.getValue());
		}

		return llhasmap;
	}

	private static Map<Integer, Integer> usingJava8Streams(Map<Integer, Integer> map) {
		
		
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}

}
