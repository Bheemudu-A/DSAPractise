package practise.arrays;

public class MissingSum {	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6};
		
	System.out.println("Missing Number : "+missinNumber(arr));
	}

	private static int missinNumber(int[] arr) {
		
		int lastNum = arr[arr.length-1];
		int sum = (lastNum*(lastNum+1))/2;
		int arrSum = 0;	
		for(int i=0;i<arr.length;i++) {
			arrSum += arr[i];
		}
		System.out.println("Sum : "+sum+"arrSum : "+arrSum);
		return sum-arrSum;
	}

}
