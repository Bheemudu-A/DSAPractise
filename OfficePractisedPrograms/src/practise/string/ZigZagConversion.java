package practise.string;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
    	
    	StringBuffer[] buff = new StringBuffer[numRows];
    	for(int i=0;i<buff.length;i++) {
    		buff[i] = new StringBuffer();
    	}
    	
    	int currRow = 0;
    	boolean isbottom = false;
    	 	 	
    	for(char ch : s.toCharArray()) {
    		buff[currRow].append(ch);   		
    		if(currRow == 0 || currRow == numRows-1) {
    			isbottom = !isbottom;
    		}		
    		currRow += isbottom?1:-1;
    	}
    	
    	StringBuffer result = new StringBuffer();
    	for(StringBuffer b: buff) {
    		result.append(b);
    	}
    	return result.toString();
    }

    /*op:
     *	
 		Row 0: P       A       H       N
        Row 1: A   P   L   S   I   I   G
        Row 2: Y       I       R


		Row 0: "PAHN"
		Row 1: "APLSIIG"
		Row 2: "YIR"
 	 *
     */
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Converted: " + convert(s, numRows));
        // Output: "PAHNAPLSIIGYIR"
    }
}

