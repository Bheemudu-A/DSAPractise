package practise.string;

//Given two strings s and p, find all the start indices of p's anagrams in s.
public class FindAnagaramFisrtIndex {
	
	public static void main(String[] args) {
		
		String s = "baebabacd";
        String p = "abc";
        
     System.out.println("index of permuted string : "+findPermutedStringStartingIndex(s, p));
	}

	private static int findPermutedStringStartingIndex(String s, String p) {
		
		int[] pArr = new int[26];
		int[] sArr = new int[26];
		
		for(char ch : p.toCharArray()) {
			pArr[ch-'a']++;
		}
		
		for(int i=0;i<s.length();i++) {
			sArr[s.charAt(i)-'a']++;
			
			if(i>=p.length()) {
				sArr[s.charAt(i-p.length())-'a']--;
			}
			
		
			if(isPermuted(pArr, sArr)) {
				return i-p.length()+1;
			}
			
		}
		return -1;
	}

	private static boolean isPermuted(int[] pArr, int[] sArr) {
		
		for(int i=0;i<pArr.length;i++) {
			if(pArr[i] != sArr[i]) {
				return false;
			}
		}
		return true;
	}

}
