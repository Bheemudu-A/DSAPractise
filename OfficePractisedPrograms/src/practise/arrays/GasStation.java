package practise.arrays;


/*
 * You are given two integer arrays gas and cost, where:

   gas[i] is the amount of gas at station i.
   cost[i] is the cost of gas required to travel from station i to station i+1.
   Your task is to determine if you can travel around the circuit starting at one of the gas stations. If you can, return the index of the starting gas station. Otherwise, return -1.
 */
public class GasStation {
	
	public static void main(String[] args) {
		
		int[] gas = {1, 2, 3, 4, 5}; //{2,3,4}
        int[] cost = {3, 4, 5, 1, 2}; //{3,4,3} ex op:-1
        
      System.out.println("startindex : "+canCompleteTrip(gas, cost));
	}

	private static int canCompleteTrip(int[] gas, int[] cost) {
	
		int totalGas =0;
		int totalCost =0;
		int startIndex =0;
		int currentTank =0;
		
		for(int i=0;i<gas.length;i++) {
			
			totalGas += gas[i];
			totalCost += cost[i];
			currentTank += gas[i]-cost[i];
			
			if(currentTank<0) {
				startIndex = i+1;
				currentTank =0;
			}
		}
		return totalGas >= totalCost ? startIndex :-1;
	}

}
