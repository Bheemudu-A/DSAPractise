package practise.string;

import java.util.Arrays;

public class ReveseEachWordOfArray {
	
	public static void main(String[] args) {
		
		String[] strArr = {"we", "are", "all", "okay"};
		 
	System.out.println("reversed String Array : "+Arrays.toString(reverseWordsOfArray(strArr)));
		
	}

	private static String[] reverseWordsOfArray(String[] strArr) {

	//	String[] revArr = new String[strArr.length];

		int index=0;
		for(String str : strArr) {
			String newStr = "";
			for(int i=str.length()-1;i>=0;i--) {
				newStr += str.charAt(i);
			}
			strArr[index++] = newStr;
		}
		return strArr;
	}

}
