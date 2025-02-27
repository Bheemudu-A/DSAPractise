package practise.arrays;

public class RotatedArray {
	
	public static void main(String[] args) {
		
		int[] arr  = {3,4,5,0,1,2};
		
		if(isRotatedArray(arr)) {
			System.out.println("Given Array is Sorted array : true");
		}else {
			System.out.println("Array is not rotated array : false");
		}
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
