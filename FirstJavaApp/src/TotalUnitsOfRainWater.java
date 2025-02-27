
public class TotalUnitsOfRainWater {

	
	public static void main(String[] args) {
	 
	int[] bars = {3,0,1,0,4,0,2}; //3,0,2,0,4 op:7
	
	System.out.println("TotalunitsOfWater : "+calTotalUnitsOfWater(bars));
	}

	private static int calTotalUnitsOfWater(int[] bars) {

		int totalUnitsOfWater =0;
		int leftmax = bars[0];
		int rightmax =bars[bars.length-1];
		int i=1,j = bars.length-2;

		while(i<=j) {// condition should be i<=j beacuse when i==j used to compare i-1 & j+1
			if(leftmax <= rightmax) {
				if(leftmax>=bars[i]) {
					totalUnitsOfWater += (leftmax-bars[i]);
				}else {
					leftmax = bars[i];
				}
				i++;	
			}else {
				if(rightmax>=bars[j]) {
					totalUnitsOfWater += (rightmax-bars[j]);
				}else {
					rightmax = bars[j];
				}
				j--;	
			}

		}
		return totalUnitsOfWater;
	}	
}
