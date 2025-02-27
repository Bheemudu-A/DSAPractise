import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineListIntoString {

	public static void main(String[] args) {
		
		List<String> list3 = Arrays.asList("Hello", " ", "World", "!");
		System.out.println(makingListIntoaSingleString(list3));
		System.out.println("Using Java 7 : "+usingJava7(list3));
		
		
		stringComparison();
	}

	private static String usingJava7(List<String> list3) {
		
		String combinedWord = "";
		
		for(String element : list3) {
		//	combinedWord += element;		
	//	combinedWord.concat(element); //it works for stringBuilder or StringBuffer
			//to do concat in string we need follow below process
			 combinedWord = combinedWord.concat(element);
		}
		return combinedWord;
	}

//using streams
   private static String makingListIntoaSingleString(List<String> list3) {
		String word = list3.stream().collect(Collectors.joining());	
		return word;
	}

	

	private static void stringComparison() {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//stores in heap memory, creates object for each literal
		if(str1==str2) {
			System.out.println("Both str1 & str2 pointing to same refernce");
		}else{
			System.out.println("str3 & str4 are different");
		}
		
		//stores in String constant Pool, shares same refernce
		String str3 = "Hello";
		String str4 = "Hello";
		
		if(str3==str4) {
			System.out.println("Both str3 & str4 are pointing to same refernce");
		}else{
			System.out.println("str3 & str4 are different");
		}
		
	}
}
