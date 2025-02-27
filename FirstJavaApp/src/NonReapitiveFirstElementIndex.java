import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NonReapitiveFirstElementIndex {

	public static void main(String[] args) {
		//ex 2: loveleetcode sol : 2
		
	System.out.println("index of non repeative element : "+indexofNonReapitativechar("leetcode")); //expected : 0 
	
	System.out.println("index of non repeative element : "+usingBooleanArray("leetcode")); //expected : 0
	}
	
	
	private static int usingBooleanArray(String str) {
		int[] freq = new int[26];
		List<Character> list = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
			freq[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<list.size();i++) {
			char ch = list.get(i);
			if(freq[ch-'a']==1) {
				return i;
			}
		}
		return -1;
	}
	
	private static int indexofNonReapitativechar(String str) {
		int[] freq = new int[26];

		Queue<Character> queue = new LinkedList<Character>();

		for(int i=0;i<str.length();i++) {	
			queue.add(str.charAt(i));
			freq[str.charAt(i)-'a']++;
		}

		int i=0;
		while(i<queue.size()) {		
			char character = queue.remove();// in queue remove method will deletes and returns element	
			if(freq[character-'a']==1) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	
}


