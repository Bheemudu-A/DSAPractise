package practise.arrays;

public class SearchIn2DMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,3,5,7},
					   {10,11,16,20},
					   {23,30,34,60},
					   {61,62,63,76}
					   };
		
		int target = 62;
		
	System.out.println("is target found in 2d array : "+isTargetAvaibleInArr(arr, target));
	}

	private static boolean isTargetAvaibleInArr(int[][] arr, int target) {
		
		int rows = arr.length;
		int columns = arr[0].length;
		
		int low =0;
		int high = rows*columns-1;
		
		while(low <= high) {//<= must
			
			int mid = (low+high)/2;
			
			int row = mid/columns;//to find inside array index
			int column = mid%columns;//to find index of inside arrays
			
			if(arr[row][column]==target) {
				System.out.println("index : "+row+" "+column);
				return true;
			}else if(arr[row][column] < target) {				
				low = mid+1;
			}else {
				high = mid-1;
			}
			
		}
		return false;
	}

}
