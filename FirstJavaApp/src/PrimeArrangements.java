
public class PrimeArrangements {

	//https://leetcode.com/problems/prime-arrangements/description/
	//https://getsdeready.com/courses/design-dsa-combined/lesson/prime-arrangements-2/

	//need to know why mod is used
 //   private static int mod = 1000000007;
    
    public static void main(String[] args) {	
    	
    	PrimeArrangements primeArrangements = new PrimeArrangements();
    	
		System.out.println("factorial of primeNum at primePositions : "+primeArrangements.numPrimeArrangements(5));
	}
    
    public int numPrimeArrangements(int n) {
        
        int primeNumCount =0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                primeNumCount++;
            }
        }
        int nonPrime = n-primeNumCount;
   //     System.out.println("primeCount : "+primeNumCount +" nonprime count : "+nonPrime);
        long fact = (factorial(primeNumCount)*factorial(nonPrime));//%mod;
       return (int)fact;
    }

    private boolean isPrime(int n){
    	
    	if(n<=1) return false;
    	if(n==2 || n==3) return true;
    	if(n%2==0 || n%3==0) return false;
    	
    	for(int i=5; i*i <=n;i += 6) {
    		if(n%i==0 || n%(i+2)==0) {
    			return false;
    		}
    	}
    	
    	return true;
    }

    private long factorial(int num){
        long result=1;
        for(int i=2;i<=num;i++){
            result = (result*i);//%mod;
        }
        return result;
    }
}

