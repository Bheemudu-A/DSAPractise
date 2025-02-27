package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ) Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in 
nums
 */
public class MissingNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,7,8,2,3,1};
		
	System.out.println("missing nums in list : "+findDisappearedNums(arr));
	
//	System.out.println("missing num using array old form : "+missingNumbersInArr(arr));
	}

	private static List<Integer> findDisappearedNums(int[] arr) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {			
			int num = Math.abs(arr[i]);
			
			if(arr[num-1]>0) {
				arr[num-1] = -arr[num-1];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>0) {
				result.add(i+1);
			}
		}
		return result;
	}
	
	
	//Not working   only working for one missing num
	private static List<Integer> missingNumbersInArr(int[] arr){
		
		List<Integer> list = new ArrayList<>();
		
		Arrays.sort(arr);
		System.out.println("arr : "+Arrays.toString(arr));
		
		int i=1;		
		while(i<arr.length) {
			
			if(arr[i] != arr[i-1]+1 && arr[i] != arr[i-1]) {
				list.add(arr[i-1]+1);
			}
			i++;
		}
		
		
		return list;
	}

}
