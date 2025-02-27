package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSequenceArray {
	
	public static void main(String[] args) {
		
	int[] arr = new int[] {3,4,5,6,8,9,10,11,12};
			
	System.out.println("max Count : "+longestSeqArr(arr));
	System.out.println("Longest seq Array : "+longSeqArr(arr));
		
		
	}

	private static int longestSeqArr(int[] arr) {
		Arrays.sort(arr);
		
		int maxSeqCount =0;
		int count =1;
		int i=1;
		
		while(i<arr.length) {
			if(arr[i]==arr[i-1]+1) {
				count++;
			}else if(arr[i] != arr[i-1]) {
				count =1;
			}
			i++;
			maxSeqCount = Math.max(maxSeqCount, count);
		}
		return maxSeqCount;
	}
	
	//to print longest seq**
	private static List<Integer> longSeqArr(int[] arr){
		
		List<Integer> currSeq = new ArrayList<>();
		List<Integer> longestSeq = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {

			if(currSeq.isEmpty() || arr[i] == currSeq.get(currSeq.size()-1)+1) {
				currSeq.add(arr[i]);
			}else {
				if(currSeq.size() > longestSeq.size()) {
					longestSeq = new ArrayList<>(currSeq);
				}
				currSeq.clear();
				currSeq.add(arr[i]);
			}
		}
		
		if(currSeq.size() > longestSeq.size()) {
			longestSeq = new ArrayList<>(currSeq);
		}
		
		return longestSeq;
	}
}
