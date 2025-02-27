package src.practise.string;

import java.util.Objects;

public class CustomHashMap<K, V> {
    // Entry class to hold key-value pairs
    private static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16; // Default size
    private static final float LOAD_FACTOR = 0.75f; // Resize threshold
    private Entry<K, V>[] buckets;
    private int size;

    // Constructor
    public CustomHashMap() {
        buckets = new Entry[INITIAL_CAPACITY];
    }

    // Hash function
    private int hash(K key) {
        return Objects.hashCode(key) % buckets.length;
    }

    // Put method
    public void put(K key, V value) {
        int bucketIndex = hash(key);
        Entry<K, V> existing = buckets[bucketIndex];

        // Update value if key already exists
        while (existing != null) {
            if (Objects.equals(existing.key, key)) {
                existing.value = value;
                return;
            }
            existing = existing.next;
        }

        // Add new entry at the head of the chain
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[bucketIndex];
        buckets[bucketIndex] = newEntry;
        size++;

        // Check load factor and resize if necessary
        if ((float) size / buckets.length > LOAD_FACTOR) {
            resize();
        }
    }

    // Get method
    public V get(K key) {
        int bucketIndex = hash(key);
        Entry<K, V> entry = buckets[bucketIndex];

        // Traverse chain to find the key
        while (entry != null) {
            if (Objects.equals(entry.key, key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null; // Key not found
    }

    // Resize method
    private void resize() {
        Entry<K, V>[] oldBuckets = buckets;
        buckets = new Entry[oldBuckets.length * 2];
        size = 0;

        // Rehash all entries
        for (Entry<K, V> bucket : oldBuckets) {
            while (bucket != null) {
                put(bucket.key, bucket.value);
                bucket = bucket.next;
            }
        }
    }

    // Size method
    public int size() {
        return size;
    }

    // Main method for testing
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'One': " + map.get("One")); // Output: 1
        System.out.println("Value for 'Two': " + map.get("Two")); // Output: 2
        System.out.println("Value for 'Three': " + map.get("Three")); // Output: 3
        System.out.println("Size: " + map.size()); // Output: 3
    }
}

