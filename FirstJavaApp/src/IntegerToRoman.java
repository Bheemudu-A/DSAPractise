
public class IntegerToRoman {
	
	//https://leetcode.com/problems/integer-to-roman/description/
	
	public static void main(String[] args) {
		System.out.println("Roman Number : "+intToRoman(3567));
	}
	
	    public static String intToRoman(int num) {
	
	        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	 String[] romans= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	     
	     String str ="";
	     int i=0;
	     while(num>0){
	        if(num>=n[i]){
	            str = str+romans[i];
	            num-=n[i];
	        }else{
	            i++;
	        }
	     }
	       return str; 
	    }

}
