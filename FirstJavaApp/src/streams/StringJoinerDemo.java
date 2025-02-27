package streams;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C");	
		StringJoiner joiner = new StringJoiner("," , "[", "]"); //separater, prefix, suffix
		list.forEach(joiner::add);
		
		System.out.println("joiner : "+joiner.toString());
		
		
		StringJoiner joiner1 = new StringJoiner(":" , "{", "}");
		List<String> list1 = Arrays.asList("D", "E");
		list1.forEach(joiner1::add);
		
		joiner1.merge(joiner);//it is merging joiner into joiner1 op: joiner : {D:E:A,B,C}
		joiner.merge(joiner1);//it is merging joiner1 into joiner op: joiner : [A,B,C,D:E]
		
		System.out.println("joiner : "+joiner1.toString());
	}
}
