import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubArraySum {

	public static void main(String[] args) {		
		int[] arr = {1,2,3,4,5,5,6,3,2};
		int target = 13;
		System.out.println("minSubArrayLen : "+minSubArrayLen(target, arr));	
		System.out.println("min SubArray  : "+minSubArray(target, arr));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {	      
        int j=0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            while(sum>=target){
                minLength = Math.min(minLength, (i-j)+1);
                sum -= nums[j++];
            }
        }
        return minLength == Integer.MAX_VALUE?0:minLength;
    }
	
	
	//time - o(n), space - o(n)
	    public static int minSubArray(int target, int[] nums) {
	        int j = 0;
	        int minLength = Integer.MAX_VALUE;
	        int sum = 0;
	        List<Integer> list = new ArrayList<>();

	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];

	            // Shrink the window as long as the sum is greater than or equal to the target
	            while (sum >= target) {
	                if (minLength > (i - j) + 1) {
	                    minLength = (i - j) + 1;

	                    // Update the list with the current subarray
	                    list.clear();
	                    for (int startIndex = j; startIndex <= i; startIndex++) {
	                        list.add(nums[startIndex]);
	                    }
	                }
	                sum -= nums[j++];
	            }
	        }

	        // Output the smallest subarray
	        System.out.println("List : " + list);
	        return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }
	
}
