package dynamicprogamming;

import java.util.ArrayList;
import java.util.List;

public class MaxSumWithoutAdjacentValues {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,2,3,4},{2,3,4,5}};
		
	System.out.println("max Array : "+maxSumWithoutAdjacentElementsOfArray(arr));
	}

	
	
	//My way to solve, it's working but complex & not acceptable
	private static List<Integer> maxSumWithoutAdjacentElementsOfArray(int[][] arr) {

		List<Integer> list = new ArrayList<>();

		int firArrayEvenSum = 0;
		int firArrayOddSum = 0;
		int secArrayEvenSum =0;
		int secArrayOddSum =0;

		//instead of two loops iam iterating in one forloop
		for(int i=0;i<arr[0].length;i++) {		
			if(i%2==0) {
				firArrayEvenSum += arr[0][i];
				secArrayEvenSum += arr[1][i];	
			}else {
				firArrayOddSum += arr[0][i];
				secArrayOddSum += arr[1][i];
			}

		}


		//commenting as in above loop adding both the array elements
		/*	for(int i=0;i<arr[1].length;i++) {
			if(i%2==0) {
				secArrayEvenSum += arr[1][i];				
			}else {
				secArrayOddSum += arr[1][i];
			}	
		}*/

		if((firArrayEvenSum > firArrayOddSum) && (firArrayEvenSum > secArrayEvenSum) && (firArrayEvenSum > secArrayOddSum)) {

			for(int i=0;i<arr[0].length;i++) {
				if(i%2==0) {
					list.add(arr[0][i]);
				}
			}
		}else if((firArrayOddSum > firArrayEvenSum) && (firArrayOddSum > secArrayEvenSum) && (firArrayOddSum > secArrayOddSum)) {
			for(int i=0;i<arr[0].length;i++) {
				if(i%2!=0) {
					list.add(arr[0][i]);
				}
			}
		}else if((secArrayEvenSum > firArrayEvenSum) && (secArrayEvenSum > firArrayOddSum) && (secArrayEvenSum > secArrayOddSum)) {
			for(int i=0;i<arr[1].length;i++) {
				if(i%2==0) {
					list.add(arr[1][i]);
				}
			}	
		}else {
			for(int i=0;i<arr[1].length;i++) {
				if(i%2!=0) {
					list.add(arr[1][i]);
				}
			}

		}
		return list;
	}

}
