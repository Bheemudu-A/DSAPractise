import java.util.Arrays;

public class FindingPeakElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,3,5,6,8,4};
		
		//using streams
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("using java8 : "+max);
		
		System.out.println(	"Peak element at index : "+findPeakElement(arr));
		System.out.println("using array index : "+peakElement(arr));
		}
	
	
	private static int peakElement(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int maxIndex =0;
		
		for(int i=0;i<nums.length;i++){			
			if(nums[i]>max) {				
				max = nums[i];
				maxIndex = i;
			}			
		}
		return maxIndex;
	}
	
	
	public static int findPeakElement(int[] nums) {

		int target = nums.length-1;
		int i=0,j=nums.length-1;
		if(nums.length==1){
			return 0;
		}

		while(i<j){
			int mid = (i+j)/2;
			if(nums[mid]>nums[mid+1]){
				j = mid;
			}else
				i = mid+1;
		}
		return i;
	}
}

