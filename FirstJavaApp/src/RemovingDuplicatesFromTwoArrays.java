import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesFromTwoArrays {
	
	public static void main(String[] args) {
		
	System.out.println("Removing duplicates from 2 arrays : "+Arrays.toString(removingDuplipatesnew (new int [] {1,2,3,43,4,3}, new int[] {1,3,5,6,7,8})));
	System.out.println("Removing duplicates from 2 arrays using ArrayCopy: "+Arrays.toString(usingarrayCopy(new int [] {1,2,3,43,4,3}, new int[] {1,3,5,6,7,8})));
	
	}

	private static int[] removingDuplipatesnew(int[] nums1, int[] nums2) {		
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums1) {
			set.add(num);
		}
		
		for(int num: nums2) {
			set.add(num);
		}
		
		//Array should intialize after elements added to set, as set will fill all positons		
		int[] arr = new int[set.size()];
		
		int i=0;
		for(int num: set) {
			arr[i++] = num;
		}
		return arr;
	}
	
	
	private static int[] usingarrayCopy(int[] num1, int[] num2) {
		
		int[] destArry = new int[num1.length+num2.length];
		
		System.arraycopy(num1, 0, destArry, 0, num1.length);
		System.arraycopy(num2, 0, destArry, num1.length, num2.length);
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num:destArry) {
			set.add(num);
		}
		
	     int[] arr = new int[set.size()];
			
			int i=0;
			for(int num: set) {
				arr[i++] = num;
			}
			return arr;
	}

}
