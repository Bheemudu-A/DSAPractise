
import java.util.ArrayList;
import java.util.List;

public class IterativePermutations {

    public static List<List<Integer>> findPermutations(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Start with an empty permutation

        for (int num : nums) {
            List<List<Integer>> newPermutations = new ArrayList<>();
            for (List<Integer> perm : result) {
                // Insert the current number into every possible position in the existing permutations
                for (int i = 0; i <= perm.size(); i++) {
                    List<Integer> newPerm = new ArrayList<>(perm);
                    newPerm.add(i, num); // Insert num at position i
                    newPermutations.add(newPerm);
                }
            }
            result = newPermutations; // Update result with new permutations
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<List<Integer>> permutations = findPermutations(nums);
        System.out.println("Permutations:");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}

