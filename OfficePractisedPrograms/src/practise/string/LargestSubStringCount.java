package practise.string;

import java.util.ArrayList;
import java.util.List;

public class LargestSubStringCount {
	
	public static void main(String[] args) {
		
		String str = "aabacdefab";
		
	System.out.println("maxLength : "+countOfSubStringWithoutRepeatingChars(str));	
	System.out.println("maxLength : "+countOfSubStringWithoutRepeatingChar(str));
	}

	private static int countOfSubStringWithoutRepeatingChars(String str) {
		
		List<Character> list = new ArrayList<>();
		int right =0;
		int maxLength =0;

		for(int left =0;left<str.length();left++) {			
			char ch = str.charAt(left);

			if(!list.contains(ch)) {
				list.add(ch);
				if(maxLength<(left-right)+1) {
					maxLength = left-right+1;
				}				
			}else {
				while(list.contains(ch)) {
					list.remove(0);
					right++;
				}
				list.add(ch);
			}
		}
		return maxLength;
	}
	
private static String countOfSubStringWithoutRepeatingChar(String str){
		
		List<Character> list = new ArrayList<>();
		int right=0;
		int startIndex =0;
		int minlength = 0;
		
		for(int left=0;left<str.length();left++){
			char ch = str.charAt(left);
			
			if(!list.contains(ch)){
				list.add(ch);
				if(minlength < (left-right)+1)
				minlength = left-right+1;
				startIndex = right;
			}else{
				while(list.contains(ch)){
					list.remove(0);
					right++;
				}
				list.add(ch);
			}
		}
	return str.substring(startIndex, startIndex+minlength);
	}

}
