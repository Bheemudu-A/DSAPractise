package dynamicprogamming;


/*
 * he Min Jumps Array problem asks you to find the minimum number of jumps required to reach the end of an array, 
 * where each element in the array represents the maximum number of steps you can jump forward from that position.
 */
public class MinJumpsArray {
	
	public static void main(String[] args) {
		System.out.println("min Jumps : "+minJumps(new int[] {2, 3, 1, 1, 4}));
	}
	
	
	public static int minJumps(int[] nums) {
		if (nums.length <= 1) return 0;
		int jumps = 0, currentEnd = 0, farthest = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]);

			if (i == currentEnd) {
				jumps++;
				currentEnd = farthest;

				if (currentEnd >= nums.length - 1) {
					return jumps;
				}
			}
		}
		return -1; // If the end is not reachable
	}


}
