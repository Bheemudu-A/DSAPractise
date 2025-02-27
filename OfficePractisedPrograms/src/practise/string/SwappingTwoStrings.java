package practise.string;

public class SwappingTwoStrings {
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "world";
		
		swapGivenStrings(str1, str2);
		
	}
	
	
/*	private static void swap(String str1, String str2) {
		
		str2 = str1+str2-str1=str2;
		
	}*/

	private static void swapGivenStrings(String str1, String str2) {		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("after swapping str1 : "+str1+" str2 : "+str2);
		
	}

}
