package practise.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultiFieldSortingExample {
	
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("kurnyl", 27),
            new Person("tom", 26),
            new Person("Jack", 28)
        );

        List<Person> sortedPeople = people.stream()
                                          .sorted(Comparator.comparing(Person::getAge)
                                        		  .thenComparing(Person::getName)).
                                          				collect(Collectors.toList());
        
        //to find people who are b/w 26 & 28
        /*
         *   List<Person> filteredPeople = people.stream()
            .filter(person -> person.age >= 26 && person.age <= 28)
            .collect(Collectors.toList());
         */
                                       

        System.out.println("Sorted People: " + sortedPeople);
        // Output: [Bob (25), David (25), Alice (30), Charlie (30)]
    }
}