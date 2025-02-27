package dynamicprogamming;

import java.util.ArrayList;
import java.util.List;

public class LongestSequenceFibonaci {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		List<Integer> list = fibonaciList(arr.length);
	System.out.println("lonest seq fibonaci list : "+fibSeqElementsInaRow(arr, list));
	}
	
	private static List<Integer> fibonaciList(int num){
		List<Integer> fibonicSeries = new ArrayList<>();

		int a =0;
		int b = 1;
		fibonicSeries.add(a);
		fibonicSeries.add(b);
		for(int i=2;i<num;i++) {
			//fibonicSeries.add(a);
			int c =a+b;
			fibonicSeries.add(c);
			a=b;
			b=c;
		}
	//	fibonicSeries.add(b);
		return fibonicSeries;
	}

	private static List<Integer> fibSeqElementsInaRow(int[] arr, List<Integer> list) {

		List<Integer> fibSeqList = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(list.contains(arr[i])) {
				fibSeqList.add(arr[i]);
			}
		}
		return fibSeqList;	
	}

}
