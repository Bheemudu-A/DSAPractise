package practise.interviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCoding {
	
	
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				
				new Person(1, "book", 50, "study"),
				new Person(1, "movie", 175, "Entertainment"),
				new Person(1, "Office", 71800, "Career"),
				new Person(1, "pen", 5, "study")
				);
		
		
	double totalAmount	= list.stream().map(i -> i.getPrice()).reduce(0.0, (a,b) -> a+b);
	
	System.out.println("totalAmount : "+totalAmount);
	
	double maxAmount = list.stream().map(i -> i.getPrice()).max(Double::compare).get();
	
	System.out.println("maxAmount : "+maxAmount);
	
	List<String> names = list.stream().map(Person::getNames).sorted((a,b) -> (b.length()-a.length())).collect(Collectors.toList());
	
	System.out.println("names : "+names);
	}
	
}
