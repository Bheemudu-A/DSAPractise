package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWordsByJava8 {

	public static void main(String[] args) {
		
		List<String> list2 = Arrays.asList("apple", "banana", "pear", "grapes");
		System.out.println(groupingWordsByUsingJava8(list2));
	}

	private static Map<Integer, List<String>> groupingWordsByUsingJava8(List<String> list2) {		
		Map<Integer, List<String>> map =   list2.stream().collect(Collectors.groupingBy(String::length));
		return map;
	}
}
