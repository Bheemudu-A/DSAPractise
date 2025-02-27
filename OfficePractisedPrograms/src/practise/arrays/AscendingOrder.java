package practise.arrays;

import java.util.Arrays;

public class AscendingOrder {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,4,5,1,3};
		
	System.out.println("sorted array : "+Arrays.toString(sortArrayWithoutInbuiltMethod(arr)));
	}

	private static int[] sortArrayWithoutInbuiltMethod(int[] arr) {	
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
		return arr;
	}

}
