package practise.interviewPrograms;

import java.util.Arrays;
import java.util.List;

public class WeightedSum {
    public static int computeWeightedSum(List<Object> nestedList, int depth) {
        int total = 0;
        for (Object item : nestedList) {
            if (item instanceof Integer) {
                // Add integer multiplied by the current depth
                total += (Integer) item * depth;
            } else if (item instanceof List) {
                // Recursively compute the weighted sum for the sublist with increased depth
                total += computeWeightedSum((List<Object>) item, depth + 1);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Example input: [1, [2, 3], [4, [5, 6]]]
        List<Object> nestedList = Arrays.asList(
            1,
            List.of(2, 3),
            List.of(4, List.of(5, 6))
        );

        int result = computeWeightedSum(nestedList, 1);
        System.out.println("Weighted Sum: " + result); // Output: 50
    }
}

