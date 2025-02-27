import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	//https://leetcode.com/problems/roman-to-integer/description/
	
	public static void main(String[] args) {
		System.out.println("Roman Number : "+romanToInt("LVIII"));
		
		System.out.println("using Map : "+usingMap("LVIII"));//LIXVII --op:66
	}
	
	
	private static int usingMap(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('L', 50);
		map.put('V', 5);
		map.put('I', 1);
		map.put('X', 10);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total =0;
		int previousValue =0;
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			int currentValue = map.get(ch);
			
			if(currentValue < previousValue) {
				total -= currentValue; //subracting beacuse IX--it should be 9 not 11
			}else {
				total += currentValue;
			}
			previousValue = currentValue;
		}
		return total;
	}

	public static int romanToInt(String s) {
		int num =0;
		int ans =0; 

		for(int i=s.length()-1;i>=0;i--){
			switch(s.charAt(i)){
			case 'I': num =1; break;
			case 'V': num =5; break;
			case 'X': num =10; break;
			case 'L': num =50; break;
			case 'C': num =100; break;
			case 'D': num =500; break;
			case 'M': num =1000; break;

			}
			if(4*num<ans) ans -=num;//not understood
			else ans+= num;
			//ans+= num;
			System.out.println("Ans  : "+ans);
		}
		return ans;
	} 
}
