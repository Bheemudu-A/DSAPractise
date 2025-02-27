package practise.arrays;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 38;
		
	System.out.println("sum after summing till single digit : "+addingUntilSingleDigitFound(num));
		
		
	}

	private static int addingUntilSingleDigitFound(int num) {
		
		//used these condition because after summing all digits if sum >= 10, then again sum it by re assigning it to num, till sum is single digit (sum<10)
		while(num>=10) {
			int sum =0;
			while(num>0) {
				int rem = num%10;
				sum += rem;
				num /= 10;
			}
			num = sum;
		}	
		return num;
	}
}
