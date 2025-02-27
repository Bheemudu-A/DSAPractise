package dynamicprogamming;

/*
 * The Climbing Stairs Problem is a classic dynamic programming problem.
 *  It involves finding the number of distinct ways to climb a staircase with n steps if you can take either 1 or 2 steps at a time.
 */
public class ClimbingStairCase {
	
	public static void main(String[] args) {
		
		int steps = 5;
		
	System.out.println("no: of ways : "+noOfWaysToClimb(steps));
	System.out.println("using arrays : "+usingArrays(steps));
	}

	//with min space complexity
	private static int noOfWaysToClimb(int steps) {

		if(steps == 0 || steps == 1 || steps ==2) {
			return steps;
		}

		int first = 1;
		int second = 2;

		for(int i=3;i<=steps;i++) {
			int current = first+second;
			first = second;
			second = current;
		}
		return second;
	}
	
	//using arrays
	private static int usingArrays(int steps) {

		if(steps <= 2) {
			return steps;
		}

		int[] arr = new int[steps+1];

		arr[1] = 1;
		arr[2] = 2;

		for(int i=3;i<=steps;i++) {
			arr[i] = arr[i-1]+arr[i-2];			
		}		
		return arr[steps];	
	}

}
