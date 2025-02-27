package practise.string;

public class SumofIntegersbyIgnoringChars {
	
	public static void main(String[] args) {
		
		String str = "1ancjk8k43";
		
	System.out.println("sum of digits : "+sumOfDigits(str));
	}

	private static int sumOfDigits(String str) {
		int sum =0;

		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum += (ch-'0');
			}
		}
		return sum;
	}

}
