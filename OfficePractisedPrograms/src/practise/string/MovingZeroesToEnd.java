package practise.string;

public class MovingZeroesToEnd {
	
	public static void main(String[] args) {
		String str = "abc02m050";
	System.out.println("Moved Zero to end : "+movingZeroToEnd(str, '0'));
	}

	private static String movingZeroToEnd(String str, char target) {
	
		int count =0;
		StringBuffer newStr = new StringBuffer();
		
		for(char ch : str.toCharArray()) {
			if(ch != target) {
				newStr.append(ch);
				count++;
			}
		}
		while(count<str.length()) {
			newStr.append(target);
			count++;
		}
	return newStr.toString();
	}

}
