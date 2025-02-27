
public class RotatedSortedArray {
	
	public static void main(String[] args) {
		int[] nums = {3,4,5,0,1,2};//ex2: 3,4,5,2,1 false
		//expected : true
		System.out.println("Is Array is Sorted and Rotated : "+check(nums));
		System.out.println("Is Array is Sorted and Rotated 2 : "+isRotatedArray(nums));
	}
	
	public static boolean check(int[] nums) {
		int count =0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>nums[(i+1)%nums.length]){
				count++;
			}
			if(count>1){
				return false;
			}
		}
		return true;
	}
	
	private static boolean isRotatedArray(int[] arr) {			
		int count =0;			
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}		
		//to check whether last element is less than 1st element
		if(arr[arr.length-1]>arr[0]) {
			count++;
		}			
		return count==1;
	}

}
