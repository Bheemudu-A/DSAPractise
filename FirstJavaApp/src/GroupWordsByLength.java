import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple", "banana", "pear", "grapes");
		
	System.out.println("Using Java7 : "+groupingWordUsingJava7(list));
	
	//using streams
	System.out.println("Using Streams : "+groupingWordsByUsingJava8(list));
	}

	private static Map<Integer, List<String>> groupingWordsByUsingJava8(List<String> list) {
		
	 Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
		
		return map;
	}

	private static Map<Integer, List<String>> groupingWordUsingJava7(List<String> list) {
		Map<Integer, List<String>> map = new HashMap<>();
		
		for(String element: list) {
			int length =element.length();
				map.putIfAbsent(length, new ArrayList());
				map.get(length).add(element);
		}
		
		return map;
	}

}
