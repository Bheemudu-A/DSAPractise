package practise.arrays;

public class MaxSumArray {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArraySum(int[] arr) {
        int overalMax = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max + arr[i]);
            overalMax = Math.max(overalMax, max);
        }
        return overalMax;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        
       int result = maxSubArraySum(arr);
        System.out.println("Maximum sum of subarray is: " + result);
    }
}

