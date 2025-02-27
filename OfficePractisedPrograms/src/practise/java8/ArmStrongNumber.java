package practise.java8;

public class ArmStrongNumber {
	
	
	static int length =0;
	
	public static void main(String[] args) {
		
		int num = 153;
		String value = String.valueOf(num);
		
		int length = value.length();
		
		boolean isArmStrongNum =  value.chars().mapToObj(Character::getNumericValue).map(a -> (int)Math.pow(a, length)).reduce(0, (a,b) -> a+b)==num; //(a,b) -> a+b
		
		System.out.println("isArmStrongNum : "+isArmStrongNum);
		
		System.out.println("isArmStrongNum using Java7 : "+usingJava7(num));
	}
	
	
	public static boolean usingJava7(int num){	
		
		String nmber = String.valueOf(num);
		int length = nmber.length();
	
		int armValue = 0;		
		while(num>0) {
			int remainder = num%10;
			armValue += (int)Math.pow(remainder, length);
			System.out.println("armValue : "+armValue +" remainder : "+remainder);
			num = num/10;			
		}
		//iam using Integer.parseInt(nmber) because num becomes lessthan zero, where in streams it was not changed due to immutability
		
		return armValue==Integer.parseInt(nmber);
	}
	
}
