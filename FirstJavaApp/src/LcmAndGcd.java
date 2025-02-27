import java.util.Arrays;

public class LcmAndGcd {
	
	public static void main(String[] args) {
		System.out.println("output : "+Arrays.toString(lcmAndGcd(14,8)));
		
	}
	
	static int[] lcmAndGcd(int i , int j) {
        // code here
        
        int gcd = gcdofNum(i, j);
        int lcm = lcmOfNum(i, j, gcd);
        int[] result = {lcm, gcd};
    return result;
    }
    
    protected static int gcdofNum(int i, int j){
        if(i==0){
            return j;
        }
        return gcdofNum(j%i, i);
    }
    
    protected static int lcmOfNum(int i, int j, int gcd){
        return(i*j/gcd);
    }

}
