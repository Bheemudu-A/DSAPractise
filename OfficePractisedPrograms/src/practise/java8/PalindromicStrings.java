package practise.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromicStrings {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Level", "apple", "radar", "banana", "civic");
			
		List<String> palindromStrings =	words.stream().filter(word -> word.equalsIgnoreCase(new StringBuffer(word).reverse().toString())).collect(Collectors.toList());
	
		System.out.println(palindromStrings);
		
		System.out.println("using java8 : "+usingJava8(words));
		
		String input = "Was it a car or a cat I saw";	//Output: true
		
	System.out.println("Using String : "+checkWhetherGivenStringPalindrom(input));
		
		
	}
	
	private static boolean checkWhetherGivenStringPalindrom(String input) {
		
		String str=input.replaceAll("\\s","").toLowerCase();
		
	/*	char[] ch = str.toCharArray();
		
		int i=0;
		int j= ch.length-1;
		
		while(i<j) {		
			if(ch[i] != ch[j]) {
				return false;
			}
			i++;
			j--;
			
		}*/
		
		int i=0;
		int j= str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

	//list of palindroms
	private static List<String> usingJava8(List<String> list){
		List<String> solList = new ArrayList<>();
		
		for(String str : list) {			
			if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
				solList.add(str);
			}
		}
		
		return solList;
	}
	
	//if your strictly not using any inbuilt method
	    public static String reverse(String str) {
	        // Create an empty character array of the same length
	        char[] reversed = new char[str.length()];
	        
	        // Manually copy characters from the original string in reverse order
	        for (int i = 0; i < str.length(); i++) {
	            reversed[str.length() - 1 - i] = str.charAt(i);
	        }
	        
	        // Convert character array to string manually
	        String result = "";
	        for (char c : reversed) {
	            result += c;  // Concatenating characters manually
	        }
	        
	        return result;
	    }

}
