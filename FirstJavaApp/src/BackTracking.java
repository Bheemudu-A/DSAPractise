
public class BackTracking {
	
	public static void main(String[] args) {
		String str = "ABC";
		printingNumOfPermutationsOfStr(str, "", 0);
	}

	private static void printingNumOfPermutationsOfStr(String str, String perm, int index) {

		if(str.length()==0) {
			System.out.println("Permutations are : "+perm);
			return;
		}


		for(int i=0;i<str.length();i++) {
			char currChar = str.charAt(i);
			String subStr = str.substring(0, i)+str.substring(i+1);
			printingNumOfPermutationsOfStr(subStr, perm+currChar, i+1);
		}

	}
	
	
	

}
