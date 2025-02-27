package practise.arrays;

/*
 * The Best Time to Buy and Sell Stock III problem is a variation of the typical "stock buy and sell" problem, 
 * where you're allowed to make at most two transactions (i.e., buy and sell up to two times). 
 * The objective is to maximize the profit from these transactions.
 */
public class BestTimeToBuyAndSellStockIII {
	
	public static void main(String[] args) {
		
		int[] arr = {3,3,5,0,0,3,1,4};
		
		System.out.println("max profit all buying and selling stocks twice : "+bestTimetoBuyandSellStockesTwice(arr));
	}

	private static int bestTimetoBuyandSellStockesTwice(int[] arr) {
		
		int buy1 = Integer.MIN_VALUE;
		int buy2 = Integer.MIN_VALUE;
		
		int sell1 = 0;
		int sell2 =0;
		
		for(int i=0;i<arr.length;i++) {
			
			buy1 = Math.max(buy1, -arr[i]);
			sell1 = Math.max(sell1, buy1+arr[i]);
			buy2 = Math.max(buy2, sell1-arr[i]);
			sell2 = Math.max(sell2, buy2+arr[i]);
		}
		
		System.out.println(buy1 +" "+sell1+" "+buy2+" "+sell2);
		return sell2;
	}

}
