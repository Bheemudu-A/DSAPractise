package practise.arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiralmatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = { {1,2,3,4},
					    {5,6,7,8},
					    {9,10,11,12},
					    {13,14,15,16}
					  };
		
	System.out.println("spiral print of matrix : "+printArrInSpiralWay(arr));
	}
	
	
	private static List<Integer> printArrInSpiralWay(int[][] arr) {
	    List<Integer> list = new ArrayList<>();

	    int left = 0;
	    int right = arr[0].length - 1;
	    int top = 0;
	    int bottom = arr.length - 1;

	    while (left <= right && top <= bottom) {
	        // Traverse from left to right
	        for (int i = left; i <= right; i++) {
	            list.add(arr[top][i]);
	        }
	        top++; // Move the top boundary down

	        // Traverse from top to bottom
	        for (int i = top; i <= bottom; i++) {
	            list.add(arr[i][right]);
	        }
	        right--; // Move the right boundary left

	        if (top <= bottom) {
	            // Traverse from right to left
	            for (int i = right; i >= left; i--) {
	                list.add(arr[bottom][i]);
	            }
	            bottom--; // Move the bottom boundary up
	        }

	        if (left <= right) {
	            // Traverse from bottom to top
	            for (int i = bottom; i >= top; i--) {
	                list.add(arr[i][left]);
	            }
	            left++; // Move the left boundary right	            
	        }
	    }
	    return list;
	}

}
