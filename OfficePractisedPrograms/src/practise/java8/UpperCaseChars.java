package practise.java8;

import java.util.stream.Collectors;

public class UpperCaseChars {
	
	public static void main(String[] args) {
		
		String str = "abBHEEMudhUDU";
		
	String upperString =	str.chars().mapToObj( i -> (char)i).filter( i -> Character.isUpperCase(i)).map(String :: valueOf).collect(Collectors.joining());	
	System.out.println("upperString : "+upperString);
	
	char ch = "123".charAt(1);
	System.out.println(ch++ + ++ch);
	
	}

}
