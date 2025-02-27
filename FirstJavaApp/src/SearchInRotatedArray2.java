import java.util.Arrays;

public class SearchInRotatedArray2 {

	public static void main(String[] args) {
		
		int[] arr = {1,0,1,1,1};//{4,5,6,7,0,1,2};
		int target = 0;
		System.out.println("Number : "+target+" found in Array : "+search(arr, target));
	}
	
	public static boolean search(int[] arr, int target) {

		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(arr[mid]==target){
				System.out.println("mid : "+mid);
				return true;
			}
			
			//imp to check these conditions for 1,0,1,1,1
			while(start< mid && arr[start]==arr[mid]){
				start++;
			}
			while(end > mid && arr[end]==arr[mid]){
				end--;
			}

			if(arr[start]<=arr[mid]){
				if(arr[start]<=target && target<arr[mid]){
					end = mid-1;
				}else{
					start = mid+1; 
				}
			}else{
				if(arr[end] >= target && target> arr[mid]){
					start =mid+1;
				}else{
					end =mid-1;
				}
			}
		}
		return false;    
	}
}
