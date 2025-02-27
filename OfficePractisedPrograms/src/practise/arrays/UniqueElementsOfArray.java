package practise.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElementsOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,4,7,6,8};
		
	System.out.println("unique elements of arr : "+printUniqueElementsOfArray(arr));
	System.out.println("unique elements using map : "+usingMap(arr));
	}

	private static List<Integer> printUniqueElementsOfArray(int[] arr) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate = false;

			for(int j=0;j<arr.length;j++) {			
				if(i != j && arr[i] == arr[j]){
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate) {
				result.add(arr[i]);

			}
		}		
		return result;
	}
	
	//
	private static List<Integer> usingMap(int[] arr){
		
	Map<Integer, Integer> map = new HashMap<>();	
	List<Integer> result = new ArrayList<Integer>();
	
	 for(int num : arr) {
		map.put(num, map.getOrDefault(num, 0)+1);
	 }
	
	 for(int el : map.keySet()) {
		 
		 if(map.get(el)==1){
			 result.add(el);
		 }
	 }
	return result;
	}

}
