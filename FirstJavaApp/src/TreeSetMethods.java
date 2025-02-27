import java.util.TreeSet;
import java.util.SortedSet;
import java.util.NavigableSet;

public class TreeSetMethods {
    public static void main(String[] args) {
    	
    	 TreeSet<String> treeSetNull = new TreeSet<>();
    	
    	 treeSetNull.add(null);
    	 System.out.println(treeSetNull);
    	
        // Creating a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. add() - Adding elements to the TreeSet
   //     treeSet.add(null);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(25);  // Inserting 25 in between
 //       treeSet.add(null); //null insertion not possible
        System.out.println("TreeSet after adding elements: " + treeSet);

        // 2. remove() - Removing an element
        treeSet.remove(20);
        System.out.println("TreeSet after removing 20: " + treeSet);

        // 3. first() - Get the first (smallest) element
        System.out.println("First element: " + treeSet.first());

        // 4. last() - Get the last (largest) element
        System.out.println("Last element: " + treeSet.last());

        // 5. higher() - Get the least element strictly greater than the given element
        System.out.println("Element higher than 25: " + treeSet.higher(25));

        // 6. lower() - Get the greatest element strictly less than the given element
        System.out.println("Element lower than 30: " + treeSet.lower(30));

        // 7. ceiling() - Get the least element greater than or equal to the given element
        System.out.println("Ceiling of 35 (greater than or equal to 35): " + treeSet.ceiling(35));

        // 8. floor() - Get the greatest element less than or equal to the given element
        System.out.println("Floor of 25 (less than or equal to 25): " + treeSet.floor(25));

        // 9. pollFirst() - Retrieve and remove the first (smallest) element
        System.out.println("First element polled: " + treeSet.pollFirst());
        System.out.println("TreeSet after pollFirst: " + treeSet);

        // 10. pollLast() - Retrieve and remove the last (largest) element
        System.out.println("Last element polled: " + treeSet.pollLast());
        System.out.println("TreeSet after pollLast: " + treeSet);

        // Adding elements again for subset operations
        treeSet.add(10);
        treeSet.add(50);

        // 11. subSet() - Get a view of the portion of the set between two elements
        SortedSet<Integer> subset = treeSet.subSet(10, 40); // From 10 (inclusive) to 40 (exclusive)
        System.out.println("Subset from 10 to 40 (exclusive): " + subset);

        // 12. descendingSet() - Return a reverse-order view of the elements
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("TreeSet in descending order: " + descendingSet);

        // 13. contains() - Check if the set contains a specific element
        System.out.println("TreeSet contains 25: " + treeSet.contains(25));

        // 14. size() - Get the number of elements in the set
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // 15. isEmpty() - Check if the set is empty
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());

        // 16. clear() - Remove all elements from the set
        treeSet.clear();
        System.out.println("TreeSet after clearing all elements: " + treeSet);
        
        
        // Creating an empty TreeSet 
        TreeSet<String> tree = new TreeSet<String>(); 
  
        //if treeSet has numericals of String type, sorting will be based on 1 digit, ex: "100" is smaller than "4" as in below example
        tree.add("Welcome"); 
        tree.add("To"); 
        tree.add("Geeks"); 
        tree.add("4"); 
        tree.add("230"); 
        tree.add("100");
        tree.add("Geeks"); 
        tree.add("TreeSet"); 
  
        // Displaying the TreeSet 
        SortedSet<String> sub =    tree.subSet("100", "Welcome");
  
        // Displaying the TreeSet after removal 
        System.out.println("New TreeSet: " + tree+" "+sub);
    }
}
