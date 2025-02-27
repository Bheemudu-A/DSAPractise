package practise.string;

public class uniqueElementsOf2Strings {
	
	public static void main(String[] args) {

		String str1 = "helaloworlda";
		String str2 = "hicodingworld";

		System.out.println("uniq chars of two strings : "+uniqueElementsofTwoStrings(str1, str2));
	//	System.out.println("uniq chars of two strings : "+solveUsingIntArray(str1, str2));	
	}

	private static String uniqueElementsofTwoStrings(String str1, String str2) {
		
		boolean[] bol = new boolean[126];
		int[] charArr = new int[26];
		StringBuffer buffer  = new StringBuffer();
		
		for(int i=0;i<str1.length();i++) {
			charArr[str1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<str1.length();i++) {
			if(!bol[str1.charAt(i)] && charArr[str1.charAt(i)-'a']==1) {
				for(int j=0;j<str2.length();j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						bol[str1.charAt(i)] = true;
						break;	
					}
				}
				
				if(!bol[str1.charAt(i)]) {
				 buffer.append(str1.charAt(i));
				 bol[str1.charAt(i)] = true;
				}
			}
		}
		
		for(int j=0;j<str2.length();j++) {			
			if(!bol[str2.charAt(j)]) {
				for(int i=0;i<str1.length();i++) {
					if(str2.charAt(j) == str1.charAt(i)) {
						bol[str2.charAt(j)] =true;
						break;
					}
				}
				
				if(!bol[str2.charAt(j)]){
					buffer.append(str2.charAt(j));
					bol[str2.charAt(j)] =true;
					
				}
			}
			
		}
		return buffer.toString();
	}
	
	
	//need to check it
	private static String solveUsingIntArray(String str1, String str2){
		 
		int[] arr = new int[26];
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		for(int i=0;i<ch1.length;i++){	
			arr[ch1[i]-'a']++;
		}
		
		for(int i=0;i<ch2.length;i++){	
			arr[ch2[i]-'a']++;
		}
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0;i<ch1.length;i++) {
			if(arr[ch1[i]-'a']==1) {
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				buffer.append(arr[i]);
			}
		}
		return buffer.toString();
	 }


}
