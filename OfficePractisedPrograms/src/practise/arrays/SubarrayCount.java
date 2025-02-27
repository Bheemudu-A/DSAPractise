package practise.arrays;

public class SubarrayCount {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
	System.out.println("subArray Count : "+countOfPossibleSubArrays(arr));
	}

	private static int countOfPossibleSubArrays(int[] arr) {
		int subArrCount =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");//sub Array						
				}
				subArrCount++;
				System.out.println();
			}
		}
		return subArrCount;
	}

}
