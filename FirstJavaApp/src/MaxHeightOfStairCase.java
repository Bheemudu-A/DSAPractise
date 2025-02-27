import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MaxHeightOfStairCase {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int N= input.nextInt();
		System.out.println("MaxHeight Of a StairCase : "+maxStairHeight(N)+" using Formula : "+maxStairHeightUsingFormula(N));
	}
	
	//o(n);
	static int maxStairHeight(int N) {
        
	   int step =1;
	    int height =0;
	    
	    while(N>=step){
	        N -= step;
	        step++;
	        height++;
	    }
	      return height;
	    }
	
	
	//using formula o(1);
	static int maxStairHeightUsingFormula(int N) {
		return (int) ((Math.sqrt(1+8*N)-1)/2);
				
	}
}
