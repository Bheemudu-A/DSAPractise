package practise.string;

public class NaiveStringMatching {
    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";

        naiveStringMatch(text, pattern);
    }

    public static void naiveStringMatch(String text, String pattern) {
    	int n = text.length();
    	int m = pattern.length();
    	
    	for(int i=0;i < n-m+1;i++) {
    		int j;  //declare j outside inner loop because to check count outside inner loop 		
    		for(j=0;j<m;j++) {
    			if(text.charAt(i+j) != pattern.charAt(j)) {
    				break;
    			}
    		}
    		
    		if(j==m) {
    			System.out.println("pattern found at : "+i);
    		}
    		
    	}
    	
    }
}

