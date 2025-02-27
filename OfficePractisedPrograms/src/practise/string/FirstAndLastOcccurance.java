package practise.string;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstAndLastOcccurance {
	
	public static void main(String[] args) {
		
		String str = "abecedeab";
		
	System.out.println("firstAndLast occurance : "+findFirstAndLastOccur(str, 'a'));
	usingInBuiltMethod(str, 'a');
	}
	
	private static void usingInBuiltMethod(String str, char target) {
		
		int firstIndex = str.indexOf(target);
		int lastIndex = str.lastIndexOf(target);
		
		System.out.println("firstIndex : "+firstIndex+" LastIndex : "+lastIndex);
		
	/*	if(firstIndex != -1) {
			System.out.println("firstIndex : "+firstIndex);
		}else {
			System.out.println("LastIndex : "+lastIndex);
		}*/
		
	}

	private static Map<String, Integer> findFirstAndLastOccur(String str, char target) {

		boolean isFirst = false;
		Map<String, Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++) {

			if(str.charAt(i)==target) {				
				if(!isFirst) {
					map.put("First", i);
					isFirst = true;
				}else {
					map.put("Last", i);
				}
			}

		}
		return map;	
	}

}
