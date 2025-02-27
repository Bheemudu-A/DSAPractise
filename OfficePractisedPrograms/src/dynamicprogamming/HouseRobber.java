package dynamicprogamming;

/*
 * Here’s an example of a Professional Robber Program in Java, solving the "House Robber Problem." 
 * The problem is to maximize the amount of money a robber can steal without robbing two adjacent houses
 */
public class HouseRobber {
	
	public static void main(String[] args) {
		
		int[] moneyofhouses = new int[] {2,4,7,8,2,1};
		
	System.out.println("max amount robber can rob without robbing adjacent houses : "+maxRobWithoutAdjacentHouse(moneyofhouses));
	}

	private static int maxRobWithoutAdjacentHouse(int[] moneyofhouses) {
		int len = moneyofhouses.length;
		
		if(len==1) {
			return moneyofhouses[0];
		}
		
		int[] arr = new int[len];
		arr[0] = moneyofhouses[0];
		arr[1] = Math.max(arr[0], moneyofhouses[1]);
		
		for(int i=2;i<moneyofhouses.length;i++) {
			arr[i] = Math.max(arr[i-1], arr[i-2]+moneyofhouses[i]);
			System.out.println("arr[i] : "+arr[i]);
		}
		return arr[len-1];
	}

}
