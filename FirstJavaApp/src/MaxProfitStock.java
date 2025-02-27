
public class MaxProfitStock {

	public static void main(String[] args) {
		
		int[] arr = {7,1,2,6,5,8,4};
		
		System.out.println("Max Profit using BruteForce : "+ calMaxProfitWith(arr));
	}
	
	//BruteForce time--o(n)^2
	
	
	
	
	private static int calMaxProfitWith(int[] arr){
		
		int buy = Integer.MAX_VALUE;
		int sell = Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++){
			buy = Math.min(buy, arr[i-1]);
			int result = arr[i]-buy;
			sell = Math.max(sell, result);
		
		}
		return sell;
	}
}
