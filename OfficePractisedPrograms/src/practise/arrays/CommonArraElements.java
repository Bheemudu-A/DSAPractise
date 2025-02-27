package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonArraElements {

	public static void main(String[] args) {
		
		int[] arr1 = {1,4,2,3,8,5,6};
		int[] arr2 = {2,4,5,10,11};
		
	System.out.println(" Using Array : "+Arrays.toString(usingArray(arr1, arr2)));	
	System.out.println("common elements : "+Arrays.toString(commonElementsOfTwoArrays(arr1, arr2)));
	}

	//Intersection of two arrays
	private static int[] usingArray(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0;
		int j=0;
		int l1 = arr1.length;
		int l2 = arr2.length;
		int k=0;
		
		while(i<l1 && j<l2) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else{
				arr1[k++] = arr1[i++];
				j++;
			}
		}
		return Arrays.copyOfRange(arr1, 0, k);
	}
	
	
	
	//using List
	private static int[] commonElementsOfTwoArrays(int[] arr1, int[] arr2) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> sol = new ArrayList<>();

		for(int num1: arr1) {
			list1.add(num1);
		}

		for(int num2: arr2) {
			if(list1.contains(num2)) {
				sol.add(num2);
			}	
		}

		
		int[] solArr = new int[sol.size()];
		for(int i=0;i<sol.size();i++) {
			solArr[i] = sol.get(i);
		}
		return solArr;
	}
}
