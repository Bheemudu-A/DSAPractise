package practise.arrays;

import java.util.Arrays;

public class RotateMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
	System.out.println("rotated matrix : "+ Arrays.deepToString(rotateMatrixBy90Degrees(arr)));
	}

	private static int[][] rotateMatrixBy90Degrees(int[][] arr) {

		//swapping all except [0][0], []1[1], [2][2]
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		//after above array swap the output will be: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
		//now we need to reverse it to roatate array by 90

		//now swapping 0 & 2 index of each row ex: [1,4,7] to [7,4,1]
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length-j-1];
				arr[i][arr.length-j-1] = temp;
			}
		}//[[7, 4, 1], [8, 5, 2], [9, 6, 3]]

		return arr;
	}

}
