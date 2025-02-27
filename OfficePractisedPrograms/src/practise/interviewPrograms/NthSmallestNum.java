package practise.interviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NthSmallestNum {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,0,1,3,4};
		
	System.out.println("nth smallest num : "+nthSmallestNum(arr, 3));
	}

	private static int nthSmallestNum(int[] arr, int n) {
		
		Set<Integer> set = new TreeSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		if(list.size() >= n-1) {
			return list.get(n-1);
		}else {
			return -1;
		}
	}

}
