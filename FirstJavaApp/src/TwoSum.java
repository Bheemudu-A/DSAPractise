import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {-4, -2, -2, 1, 2, 4, 6, 7, 10};
        int target = 9;
        System.out.println("two Pointer Approach : "+ Arrays.toString(solvingUsingPointers(arr, target)));
    }

    protected static int[] solvingUsingPointers(int[] arr, int target) {

        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==target) {
                return new int[] {i,j};
            }else if(arr[i]+arr[j]>target) {
                j--;
            }else
                i++;
        }
        return new int[] {};
    }
}
