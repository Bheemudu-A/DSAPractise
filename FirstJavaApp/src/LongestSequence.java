import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestSequence {

	public static void main(String[] args) {

		int[] qs = {1,2,3,4,5,2,76,102,99,101,100};

		System.out.println("finalCount : "+countOfLongestSeq(qs));
		System.out.println("length : "+listofLongestSeq(qs));

	}

	//count of longest Sequence
	private static int countOfLongestSeq(int[] arr) {
		
		int count =1;
	   int maxCount =0;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] == arr[i-1]+1) {
				count++;
			}else if(arr[i] != arr[i-1]) {
				count =1;
			}
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}


	//Print Longest sequence
	public static List<Integer> listofLongestSeq(int[] arr){

		List<Integer> result = new ArrayList<>();
		List<Integer> window = new ArrayList<>();
		
		
		for(int i=0;i<arr.length;i++) {			
			if(window.isEmpty() || arr[i] == window.get(window.size()-1)+1) {
				window.add(arr[i]);
			}else {
				if(window.size()>result.size()) {
					result = new ArrayList<>(window);
				}
				window.clear();
				window.add(arr[i]);
			}
			
		}
		
		
		return result;
	}
}
