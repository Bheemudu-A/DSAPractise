import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 1. put() - Insert key-value pairs
        treeMap.put(1, "Apple");
        treeMap.put(5, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(2, "Grapes");

        // 2. get() - Retrieve value by key
        System.out.println("Value for key 3: " + treeMap.get(3));

        // 3. remove() - Remove an entry by key
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

        // 4. containsKey() - Check if a key exists
        System.out.println("TreeMap contains key 5: " + treeMap.containsKey(5));

        // 5. containsValue() - Check if a value exists
        System.out.println("TreeMap contains value 'Orange': " + treeMap.containsValue("Orange"));

        // 6. size() - Get the number of entries
        System.out.println("Size of TreeMap: " + treeMap.size());

        // 7. firstKey() and lastKey() - Get the first and last keys
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        // 8. pollFirstEntry() - Remove and return the first entry
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Polled first entry: " + firstEntry);
        System.out.println("After polling first entry: " + treeMap);

        // 9. pollLastEntry() - Remove and return the last entry
        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
        System.out.println("Polled last entry: " + lastEntry);
        System.out.println("After polling last entry: " + treeMap);

        // 10. descendingMap() - Get a reverse order view of the map
        NavigableMap<Integer, String> descendingMap = treeMap.descendingMap();
        System.out.println("TreeMap in descending order: " + descendingMap);

        // 11. subMap() - Get a submap between a range of keys
        treeMap.put(4, "Mango");
        treeMap.put(6, "Pineapple");
        Map<Integer, String> subMap = treeMap.subMap(3, true, 6, true);  // inclusive of both 3 and 6
        System.out.println("SubMap from key 3 to 6: " + subMap);

        // 12. headMap() - Get a map of all keys less than a given key
        Map<Integer, String> headMap = treeMap.headMap(5, true);  // inclusive of key 5
        System.out.println("HeadMap up to key 5: " + headMap);

        // 13. tailMap() - Get a map of all keys greater than or equal to a given key
        Map<Integer, String> tailMap = treeMap.tailMap(4, true);  // inclusive of key 4
        System.out.println("TailMap from key 4: " + tailMap);
    }
}
