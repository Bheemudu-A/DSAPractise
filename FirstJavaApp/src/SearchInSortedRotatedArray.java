
public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,4,6,7,0,1,2,3};
		//special case {1,0,1,1,1} 
		int target = 2;
		System.out.println("Finding "+target+" Rotated Sorted Array : "+search(arr, target));
	}
	
	public static int search(int[] nums, int target) {
		
		
		int start=0;
		int end = nums.length-1;
		
		while(start <= end) {
			
			int mid = (start+end)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			
			while(start < mid && nums[start] == nums[mid]) {
				start++;
			}
			
			while(end > mid && nums[end] == nums[mid]) {
				end--;
			}
			
			if(nums[start] <= nums[mid]) {
				if(target > nums[start] && target < nums[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				if(target < nums[end] && target < nums[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}		
			}			
		}
		
		return -1;
	}
}
