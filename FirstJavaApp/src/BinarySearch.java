import java.util.Arrays;

public class BinarySearch {

	
	
	public static void main(String[] args) {
		 
		int[] bars = {5,1,11,15,10,9,7,6};
		int target = 9;
		
		System.out.println("Number "+target+ " at Index : "+search(bars, target));
		}
	
	public static int search(int[] arr, int target) { 
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (end+start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
               start = mid+1;
            }else
                end = mid-1;
        }
        return -1;
    }
}
