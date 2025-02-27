package practise.string;

public class StringCompress {
	
	public static void main(String[] args) {
		
		String str = "aaabbc"; //ex:op - a3b2c1
		
		
		System.out.println("compress String : "+makeCountOfAlphabets(str));
		
		
		String outString = "a3b2a1";
		
	System.out.println("Expand String : "+makingNumbericIntoAlphabets(outString));
	
	
	}

	//a3b2c1
	private static String makeCountOfAlphabets(String str) {
		StringBuffer buffer = new StringBuffer();
		int i=0;
		
		while(i<str.length()) {
			
			char ch  =str.charAt(i);
			
			int j=i;	
			while(j < str.length() && str.charAt(j) == ch) {
				j++;
			}
			buffer.append(ch).append(j-i);			
			i = j;
		}
		return buffer.toString();
	}
	
	
		//making a3b2c1 as aaabbcc
		private static String makingNumbericIntoAlphabets(String str) {
			StringBuffer buffer = new StringBuffer();
			
			int i=0;
			while(i<str.length()-1) {		
				char ch = str.charAt(i);
				
				int j=i+1;
				StringBuffer buff = new StringBuffer();
				while(j < str.length() && Character.isDigit(str.charAt(j))) {
					buff.append(str.charAt(j)); //if you want to avoid multiple Buffer Object's you can do as like this also ---count = count * 10 + (str.charAt(j) - '0');
					j++;
				}
				
				int count = Integer.parseInt(buff.toString());
				
				for(int c=0;c<count;c++) {
					buffer.append(ch);
				}
				i=j;
			}
			return buffer.toString();
		}

}
