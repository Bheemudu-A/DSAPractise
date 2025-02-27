package practise.string;

public class PermutationInString {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "lecabee"; // for s1 = "abc", s2 = "lecaabee"; exp;op - false; beacause we have extra 'a' 
		
	System.out.println("is String s2 is permuted to s1 : "+checkIfBothArePermutaations(s1, s2));
	}

	private static boolean checkIfBothArePermutaations(String s1, String s2) {
	
		int[] arrFreq1 = new int[26];
		int[] arrFreq2 = new int[26];
		
		for(char ch: s1.toCharArray()) {	
			arrFreq1[ch-'a']++;
		}
		
		for(int i=0;i<s2.length();i++) {	
			//intially adds upto s1 length elements, later previous elements are deleted and new elements are added making as window of size s1
			arrFreq2[s2.charAt(i)-'a']++;
			
			
			//if s2 length greater than s1 length remove intial elements to s1 length equals to s2
			if(i >= s1.length()) {
				arrFreq2[s2.charAt(i-s1.length())-'a']--;
			}
			
			if(isBothStringPermutated(arrFreq1, arrFreq2)) {
				return true;
			}
			
		}
		return false;
	}
	
	private static boolean isBothStringPermutated(int[] arrfreq1, int[] arrfreq2){
		
		for(int i=0;i<arrfreq1.length;i++) {
			if(arrfreq1[i] != arrfreq2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
