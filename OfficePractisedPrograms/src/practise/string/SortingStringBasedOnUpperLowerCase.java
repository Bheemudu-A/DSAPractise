package practise.string;

import java.util.ArrayList;
import java.util.List;

public class SortingStringBasedOnUpperLowerCase {

	public static void main(String[] args) {
		
		String str = "Hello World Welcome To Java Coding!";
		
	System.out.println("sorted String : "+sortBasedOnUpperLowerCase(str));
	}

	private static String sortBasedOnUpperLowerCase(String string) {

		List<Character> upperCase = new ArrayList<>();
		List<Character> lowerCase = new ArrayList<>();

		String str = string.replaceAll("[^a-zA-Z0-9]", "");//  [^a-zA-Z0-9] removes spaces and 
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upperCase.add(ch);
			}else {
				lowerCase.add(ch);
			}
		}

		StringBuffer buffer = new StringBuffer();
		for(char upper : upperCase) {
			buffer.append(upper);
		}

		for(char lower : lowerCase) {
			buffer.append(lower);
		}

		return buffer.toString();
	}
	
}

