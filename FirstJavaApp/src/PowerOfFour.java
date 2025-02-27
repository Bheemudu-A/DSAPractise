
public class PowerOfFour {

	public static void main(String[] args) {
		
		//20, 16--
		System.out.println("isPowerOfFour : "+isPowerOfFour(16));
	}
	
	public static boolean isPowerOfFour(int n) {	        
	        if(n<=0){
	            return false;
	        }
	
	        while(n>1){
	            if(n%4!=0){
	                return false;
	            }
	            n/=4;
	        }
	        return true;
	    }   
}
