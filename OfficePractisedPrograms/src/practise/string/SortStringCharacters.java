package practise.string;

import java.util.Arrays;

public class SortStringCharacters {
	
	public static void main(String[] args) {
		
		String str = "aedijb";
		
	System.out.println("sorted chars : "+sortCharsofString(str));
	}

	private static String sortCharsofString(String str) {
		
		char[] chArr = str.toCharArray();
		Arrays.sort(chArr);
		
		return new String(chArr);
	}

}
