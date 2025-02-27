import java.util.ArrayList;

public class ListOfPrimeNumbers {
	
	public static void main(String[] args) {
		System.out.println("prime Numbers list : "+sieveOfEratosthenes(11));
	}

    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> prime = new ArrayList<>();
        
        for(int i=2;i<=N;i++){
            if(isPrimeNum(i)){
                prime.add(i);
            }
        }
        return prime;
    }
    
    protected static boolean isPrime(int number){
        
    	//Math.sqrt(number) is optimised that number/2
        for(int i =2;i<=Math.sqrt(number);i++){
        	if(number%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    //-------------------------------------------------//
    
    //list of prime numbers in most efficient way   
    private static boolean isPrimeNum(int num) {
    	
    	if(num <= 1) return false;
    	if(num ==2 || num == 3) return true;
    	if(num%2 ==0 || num%3 == 0) return false;
    	
    	for(int i=5;i*i<=num;i += 6) {
    		if(num%i==0 || num%(i+2)==0) {
    			return false;
    		}
    	}
    	
    	
    	return true;
    }


}
