import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointer {
	
//two pointer 1st approach
//	1. sort given array
//	2. using two pointers move to based on sum
	// when to use two pointer approaches, 1. mostly we need to use sorting, 2. to find sub array's, 3. to find intersection
	// or subtraction or addition 
//	
	public static void main(String[] args) {
		int[] arr = {1,23,10,34,3,50};
		Arrays.sort(arr);
		int solution = 44;
		
		System.out.println("solution : "+Arrays.toString(sumOfTwoElements(arr, solution)));
		System.out.println("using List : "+Arrays.toString(usingList(arr, solution)));
	}

	private static int[] sumOfTwoElements(int[] arr, int solution) {
		
		int startIndex =0;
		int finalIndex = arr.length-1;
		
		while(startIndex<finalIndex) {
			int currentSum = arr[startIndex]+arr[finalIndex];
			
			if(currentSum==solution) {				
				return new int[] {arr[startIndex], arr[finalIndex]};//these are enormus arrays declaring array without name
			}else if(currentSum<solution) {
				startIndex++;
			}else
				finalIndex--;	
		}
		return new int[] {};		
	}
	
	
	//usingList we can also do with hashMap
	public static int[] usingList(int[] arr, int solution) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int num: arr) {
			list.add(num);
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.contains(solution-list.get(i))) {
				return new int[] {solution-list.get(i), list.get(i)};
			}
		}
		
	return new int[] {};	
	}
}
