import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentElements {

	public static void main(String[] args) {
		
		int[] arr = {1, 8, 6, 2, 5, 4, 3, 7, 9, 11, 8, 3, 3, 2, 3, 11,11,5, 5};
			
		int k =3;
		System.out.println("frequentElements"+usingMap(arr, k));
		
		System.out.println("using Arrays : "+usingArray(arr, k));
	}
	
	
	public static List<Integer> usingArray(int[] arr, int k){
		
		List<Integer> list = new ArrayList<>();	
		Arrays.sort(arr);
		
		
		int count =1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] == arr[i-1]) {
				count++;
			}else{
				if(count >= k) {
					list.add(arr[i-1]);
				}
				count = 1;
			}
		}
		if(count >= k) {//to check last element has count >= 3
			list.add(arr[arr.length-1]);
		}
		return list;
	}
	
	
	public static List<Integer> usingMap(int[] arr, int k){

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}

		for(int key: map.keySet()) {			
			if(map.get(key)>=k) {
				list.add(key);
			}
		}
		return list;
	}	
}
