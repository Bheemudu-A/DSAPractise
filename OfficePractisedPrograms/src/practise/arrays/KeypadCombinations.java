package practise.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeypadCombinations {

    // Map for digits to letters
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "ABC",  // 2
        "DEF",  // 3
        "GHI",  // 4
        "JKL",  // 5
        "MNO",  // 6
        "PQRS", // 7
        "TUV",  // 8
        "WXYZ"  // 9
    };

    public static void main(String[] args) {
        String input = "23"; // Input digits     
        System.out.println("Possible combinations: " +  getKeypadCombinations(input));
    }

 
    
    
    private static Queue<String> getKeypadCombinations(String digits) {
    	
    	Queue<String> queue = new LinkedList<>();
    	queue.add("");
    	
    	for(char ch : digits.toCharArray()) {		
    		int digit = ch-'0';
    		String letters = KEYPAD[digit];
    		
    		if(letters.isEmpty()) continue;
    		
    		int currSize = queue.size();
    	
    		for(int i=0;i<currSize;i++) {//should not use queue.size() in for-loop directly because: size dynamically changing in this program so, if you use then you will go to infinite loop 
    			
    			String currCombination = queue.poll(); //removing & returning 1st inserted elements
    			for(char letter : letters.toCharArray()) {
    				queue.add(currCombination+letter);
    			}
    		}
    		
    	}
    	return queue;
    }
}
