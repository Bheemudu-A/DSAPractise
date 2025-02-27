package practise.arrays;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		
		int num = 16;//ex: 18 op: false
	System.out.println("is given number is power of 2 : "+isPowerofTwo(num));
	}

	private static boolean isPowerofTwo(int num) {
		
		if(num<=0) {
			return false;
		}
		
		while(num%2==0) {
			num /=2;
		}	
		return num==1;
	}

}
