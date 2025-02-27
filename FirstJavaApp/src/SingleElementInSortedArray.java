
public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
		System.out.println("Single Element of Array is : "+singleNonDuplicate(arr));
		System.out.println("Single Element of Array is : "+singleElement(arr));
	}
	//time O(logn), space--o(1)
	public static int singleNonDuplicate(int[] nums) {
		int low =0;
		int high = nums.length-1;
		while(low<high){
			int mid = (high+low)/2;
			if(mid%2==1){
				mid--;
			}
			if(nums[mid]==nums[mid+1]){
				low = mid+2;
			}else{
				high = mid;
			}
		}
		return nums[low];
	}
	
	
	private static int singleElement(int[] nums) {
		
		int element = Integer.MIN_VALUE;
		
		for(int i=1;i<nums.length;i+=2) {
			
			if(nums[i] != nums[i-1]) {
				return nums[i-1];
			}
			
		}
		
		return 0;
	}
}
