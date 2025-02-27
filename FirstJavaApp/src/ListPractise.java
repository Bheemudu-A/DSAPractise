import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListPractise {
	
	public static void main(String[] args) {
		
		
		List<String> list1 = Arrays.asList("One", "two", "three");//we cannot perform  any operation on list we are creating as like this
		
		//we cannot perform any operation on list, if we do we can get  java.lang.UnsupportedOperationException
	//	list.add("four");
		
		System.out.println("list : "+list1);
		
		//if we want to perform any operations, on list after adding, we need to write as below  list2
		List<String> list2 = new ArrayList<String>(Arrays.asList("One", "two", "three"));
		list2.add("four");
		System.out.println("list2 : "+list2);
		
		List<String> list3 = new ArrayList<String>();
		
		list3.add(0, "one");
		list3.add(1, "two");
		list3.add(2, "two");//if you are inserting with index, index should be in order, if you miss you will get java.lang.IndexOutOfBoundsException
		
		list3.addAll(list1);
		list3.add("five");
		list3.set(1, "one");
		list3.add(null);//null insertion is possibile
		list3.add(null);
		System.out.println("list3 : "+list3);
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "bheem");
		map.put(null, "hello");
		map.put(null, "hii");
		
		System.out.println(map);
	}

}

