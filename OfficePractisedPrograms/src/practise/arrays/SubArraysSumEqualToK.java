package practise.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysSumEqualToK {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2,2, 3, 4, 5};  // Example array
        int k = 5;
        
  //  System.out.println("Sub Arrays whose sums equal to k : "+subArrays(arr, k));
    System.out.println(" using Map : "+subArray(arr, k));
	}

	private static List<List<Integer>> subArrays(int[] arr, int target) {

		List<List<Integer>> result = new ArrayList<>();		

		for(int i =0;i<arr.length;i++) {
			int sum =0;
			for(int j = i;j<arr.length;j++) {
				sum += arr[j];

				if(sum == target) {
					List<Integer> list = new ArrayList<Integer>();
					for(int k=i;k<=j;k++) {
						list.add(arr[k]);
					}
					result.add(list);
					break;
				}
				
			}
		}
		return result;
	}
	
	//need to see
	public static List<List<Integer>> subArray(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> prefixMap = new HashMap<>();
        int prefixSum = 0;

        // Initialize the map with a zero prefix sum
        prefixMap.put(0, new ArrayList<>());
        prefixMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Check if a sub array with the target sum exists
            if (prefixMap.containsKey(prefixSum - target)) {
                for (int startIndex : prefixMap.get(prefixSum - target)) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int k = startIndex + 1; k <= i; k++) {
                        subarray.add(arr[k]);
                    }
                    result.add(subarray);
                }
            }
            // Update the prefix map
            prefixMap.putIfAbsent(prefixSum, new ArrayList<>());
            prefixMap.get(prefixSum).add(i);
        }
        return result;
    }


}
