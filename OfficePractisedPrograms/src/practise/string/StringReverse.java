package practise.string;

public class StringReverse {
	
	public static void main(String[] args) {
		
	String str = "bheem";	
	System.out.println("reversed string charArr : "+usingCharArr(str));
	}

	//without inbuilt method
	private static String usingCharArr(String str) {
		
		char[] charArr = str.toCharArray();
		
		int left =0;
		int right = charArr.length-1;
		
		while(left<right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}
		return new String(charArr);
	}
	
	//normal way
	private static String normalWay(String str) {
		
		StringBuffer revStr = new StringBuffer();//use StringBuffer instead of string for frequent modifications
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr.append(str.charAt(i));
		}
		
		return revStr.toString();
	}

}
