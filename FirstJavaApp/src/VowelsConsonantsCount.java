
public class VowelsConsonantsCount {
	
	public static void main(String[] args) {
		String str = "Hello";
		
		countOfVowelsConsonants(str);
		
	}

	private static void countOfVowelsConsonants(String str) {
		
		char[] ch = new char[str.length()];
		int vowel = 0;
		int consonant = 0;
		
		long[] arr = new long[123];
		
		for(int i=0;i<str.length();i++) {			
			ch[i] = str.charAt(i);
			
		}
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') 
				vowel++;
			else
				consonant++;
		}
		
		System.out.println("vowel : "+vowel +" consonant : "+consonant);
	}

}
