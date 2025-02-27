package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Arnold", "Bob", "Charlie", "David", "Arnold");

        Map<Integer, List<String>> map = names.stream().collect(Collectors.groupingBy(String::length));       
        System.out.println("equaling by length : " + map);
        
        Map<Character, List<String>> nameLengthsByInitial = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.toList()));
        System.out.println("Name lengths by initial: " + nameLengthsByInitial);                                
        
        Map<Integer, List<String>> lengthOfWords =  names.stream().collect(Collectors.groupingBy(word -> word.length(), Collectors.mapping(i->i, Collectors.toList())));
        System.out.println(" lengthOfWords : "+lengthOfWords);
        
        Map<String, Long> countOfDuplicateNames =  names.stream().collect(Collectors.groupingBy(i ->i, Collectors.counting()));
        System.out.println("countOfDuplicateNames : "+countOfDuplicateNames);
        
        // Output: {A=[5, 6], B=[3], C=[7], D=[5]}
        
        convertingListToMap();
    }

	private static void convertingListToMap() {
		
		List<Person> list = Arrays.asList(
				new Person("Bheem", 25),
				new Person("Harsh", 27)
				);
		
	Map<String, Integer> map = list.stream().collect(Collectors.toMap(n -> n.getName(), n -> n.getAge()));
	System.out.println(map);
	
	//cumulating ages
		int sumOfAges =	list.stream().map(Person::getAge).reduce(0, Integer::sum);
		System.out.println("som of ages : "+sumOfAges);
	
	}

}
