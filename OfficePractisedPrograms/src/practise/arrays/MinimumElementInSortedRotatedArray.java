package practise.arrays;

public class MinimumElementInSortedRotatedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1};
		
	System.out.println("minimum nmber : "+minimumElementOfRotatedArray(arr));
	}

	private static int minimumElementOfRotatedArray(int[] arr) {		
		int i=1;
		while(i<arr.length) {			
			if(arr[i]<arr[(i-1)%arr.length]) {
				return arr[i];
			}
			i++;
		}
	return -1;	
	}

}
