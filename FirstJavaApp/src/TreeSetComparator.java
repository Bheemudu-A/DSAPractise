import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        // Using generics to declare a TreeSet of StringBuffer objects
        TreeSet<StringBuffer> tree = new TreeSet<>();

        tree.add(new StringBuffer("A"));  // This will trigger a ClassCastException
        tree.add(new StringBuffer("B"));
        tree.add(new StringBuffer("C"));

        System.out.println(tree);
    }
}
