package practise.string;

import java.util.HashMap;
import java.util.Map;

public class GoodString {
	
	public static void main(String[] args) {
		
		String str = "abceebca";
		
	System.out.println("is Good String : "+isGoodString(str));
	}

	//it will be good String if all characters count is same
	private static boolean isGoodString(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chArr = str.toCharArray();
		
		for(char ch:chArr) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		int count =0;
		
		for(Character ch : map.keySet()) {
			if(count ==0) {
				count = map.get(ch);
			}else {
				if(map.get(ch)!=count) {
					return false;
				}				
			}

		}
		return true;
	}

}
