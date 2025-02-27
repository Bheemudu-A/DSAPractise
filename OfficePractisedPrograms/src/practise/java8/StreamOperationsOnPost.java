package practise.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamOperationsOnPost {
	
	public static void main(String[] args) {
		
		
		List<Post> list = Arrays.asList(
				new Post(2, 30, "Post 1 by user 2"),
				new Post(1, 20, "Post 1 by user 1"),
				new Post(3, 70, "Post 1 by user 3"),
				new Post(2, 40, "Post 2 by user 2"),
				new Post(3, 100, "Post 2 by user 3")
			);
		
	List<Map.Entry<Integer, Integer>> likes =	list.stream().collect(Collectors.groupingBy(Post::getUserId, Collectors.summingInt(Post::getLikes)))
					.entrySet().stream().filter(word -> word.getValue()>50).collect(Collectors.toList());
	
	System.out.println("User Id with likes : "+likes);
		
	}

}
