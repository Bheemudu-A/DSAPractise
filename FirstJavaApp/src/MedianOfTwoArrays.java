import java.util.Arrays;

public class MedianOfTwoArrays {

	
public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,5,6};
		int[] nums = {1,2,3};
		int target = 10;
		System.out.println("Median OF sorted Array : "+findMedianSortedArrays(nums, arr));
		
	}
	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
	
	/*
	 * src the source array.(nums1)
	 * srcPos starting position in the source array.
	 * dest the destination array.(culArray)
	 * destPos starting position in the destination data.
	 * length the number of array elements to be copied.
	 */
		int[] culArray = new int[(nums1.length+nums2.length)];
	    System.arraycopy(nums1, 0, culArray, 0, nums1.length);// two copy two or more arrays
	    System.arraycopy(nums2, 0, culArray, nums1.length, nums2.length);	
		Arrays.sort(culArray);
		
		System.out.println("Cumulative Array : "+Arrays.toString(culArray));
		
		if(culArray.length%2==0){
		    return ((culArray[culArray.length/2]+culArray[(culArray.length/2)-1])/2.0);
		}else{
		    return (culArray[culArray.length/2]);
		}
    }
}
