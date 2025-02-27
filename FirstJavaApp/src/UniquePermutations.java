import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
	
public class UniquePermutations {
	
	    // Helper method to generate permutations
	    private static void generatePermutations(int[] array, int start, Set<List<Integer>> set) {
	        if (start == array.length - 1) {
	            // When we've reached the last element, add the permutation to the result list
	            List<Integer> permutation = new ArrayList<>();
	            for (int num : array) {
	                permutation.add(num);
	            }
	            set.add(permutation);
	        //    result.add(set);
	        } else {
	            for (int i = start; i < array.length; i++) {
	                // Swap the current element with the element at the start position
	                swap(array, start, i);
	                
	                // Recursively generate permutations for the remaining elements
	                generatePermutations(array, start + 1, set);
	                
	                // Backtrack to revert the swap
	                swap(array, start, i);
	            }
	        }
	    }

	    // Method to swap elements in the array
	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    // Main method to generate and return all permutations of an array
	    public static List<List<Integer>> permute(int[] array) {
	        List<List<Integer>> result = new ArrayList<>();
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        System.out.println("result size : "+result.size());
	        generatePermutations(array, 0, set);
	        result.addAll(set);
	        return result;
	    }

//	    public static void main(String[] args) {
//	        // Example Input 1
//	        int[] input1 = {1, 1, 2};
//	        List<List<Integer>> result1 = permute(input1);
//	        System.out.println("Permutations for input1:");
//	        for (List<Integer> permutation : result1) {
//	            System.out.println(permutation);
//	        }
//
//	        // Example Input 2
//	   /*     int[] input2 = {1, 2};
//	        List<List<Integer>> result2 = permute(input2);
//	        System.out.println("Permutations for input2:");
//	        for (List<Integer> permutation : result2) {
//	            System.out.println(permutation);
//	        }*/
//	    }
	    
	    
	    
	    //***************************************Using collections******************************
	    
	    
	    private static void generatePermutations(List<Integer> list, int start, Set<List<Integer>> set) {
	        if (start == list.size() - 1) {
	            // When we've reached the last element, add the permutation to the set
	            set.add(new ArrayList<>(list));
	        } else {
	            for (int i = start; i < list.size(); i++) {
	                // Swap the current element with the element at the start position
	                swap(list, start, i);

	                // Recursively generate permutations for the remaining elements
	                generatePermutations(list, start + 1, set);

	                // Backtrack to revert the swap
	                swap(list, start, i);
	            }
	        }
	    }

	    // Method to swap elements in the list
	    private static void swap(List<Integer> list, int i, int j) {
	        int temp = list.get(i);
	        list.set(i, list.get(j));
	        list.set(j, temp);
	    }

	    // Main method to generate and return all permutations of a list
	    public static List<List<Integer>> permute(List<Integer> list) {
	        Set<List<Integer>> set = new HashSet<>();
	        generatePermutations(list, 0, set);
	        return new ArrayList<>(set);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(1);
	        list.add(3);
	        
	        List<List<Integer>> permutations = permute(list);
	        
	        for (List<Integer> perm : permutations) {
	            System.out.println(perm);
	        }
	    }
}
