
public class MaxSharePricesellingeveryDay {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,7,2,5};
		
		System.out.println("maxProfit : "+maxProfit(arr));
	}
	

	public static int maxProfit(int[] prices) {
        int maxsell = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<= prices[i-1]){
                maxsell += 0;
            }else{
                maxsell += prices[i]-prices[i-1];
            }
        }
        return maxsell;
    }
	
}
