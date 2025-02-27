import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EncodingDecoding {
	
	public static void main(String[] args) {
		
		
	  /*   String[] arr = {"we","say","#","yes"};
		
		List<String> input = Arrays.asList(arr);
		
		System.out.println("input : "+input.toString());*/
		
		List<String> input = Arrays.asList("we","say","#","yes");
		
		
	//	encodingArray(input);
	String[] encodedArr =	decodingArray(encodingArray(input));
	System.out.println("encoded Array  : "+Arrays.toString(encodedArr));
	}

	private static String[] decodingArray(StringBuilder buffer) {

		List<String> decoding = new ArrayList<>();
		int i=0;
		while(i<buffer.length()) {
			int j=i;
			while(buffer.charAt(j) != '#') {//Character.isDigit(buff.charAt(j)) we can use this also
				j++;
			}
			int length = Integer.parseInt(buffer.substring(i, j));//getting length
			j+=1;//to skip separator #
			String word = buffer.substring(j, j+length);//getting word
			decoding.add(word);
			i=j+length;
		}
		return  decoding.toArray(new String[0]);
	}
	
	

	private static StringBuilder encodingArray(List<String> input) {
		
		
		StringBuilder encoded = new StringBuilder();
		for(String word: input) {
			encoded.append(word.length()).append("#").append(word);
		}
		System.out.println("encoded : "+encoded);
		return encoded;
	}
}
