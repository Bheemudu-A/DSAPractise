import java.util.Arrays;

public class MultiplicationOfTwoArrays {
	
	public static void main(String[] args) {

		int[][] arr1 = new int[] [] {{1,2,3},{4,5,6}};
		int[][] arr2 = new int[] [] {{1,2,3},{4,5,6}};

		System.out.println("Result is  : "+Arrays.deepToString(multiplyTwoArrays(arr1, arr2)));	
	}

	private static int[][] multiplyTwoArrays(int[][] arr1, int[][] arr2) {
		
		int[][] solArray = new int[2][3];
		
		System.out.println("arr1 length : "+arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {			
				solArray[i][j] = arr1[i][j]*arr2[i][j];
			}
			
		}
		return solArray;
	}

}
