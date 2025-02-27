package practise.arrays;

import java.util.Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 80},
            {61, 62, 11, 76}
        };

        System.out.println("Original Matrix:");
     //   printMatrix(matrix);
        
      System.out.println(Arrays.deepToString(matrix));//short to print 2d... arrays

        // Sort the 2D array
        sort2DArray(matrix);

        System.out.println("\nSorted Matrix:");
        printMatrix(matrix);
    }

    private static void sort2DArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Flatten the 2D array into a 1D array
        int[] flatArray = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                flatArray[index++] = num;
            }
        }

        // Step 2: Sort the 1D array
        Arrays.sort(flatArray);

        // Step 3: Reconstruct the sorted 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flatArray[index++];
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

