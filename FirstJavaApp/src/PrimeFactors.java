import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {



	public static void main(String[] args) {



		System.out.println("PrimeFactors of 100 : "+Arrays.toString(AllPrimeFactors(200)));
	}

	public static int[] AllPrimeFactors(int N){
		
		List<Integer> list = new ArrayList<>(); 

		for(int i=2;i<=N/2;i++){

			if(N%i==0){
				if(isPrime(i)){
					list.add(i);
				}
			}
		}

		int[] arr = new int[list.size()];
		int k=0;
		for(int num:list){
			arr[k]=num;
			k++;
		}

		return arr;
	}

	protected static boolean isPrime(int num){
		
		if(num<=0) return false;
		if(num==2 || num ==3) return true;
		if(num%2==0 || num%3==0) return false;
		
		for(int i=5;i*i<=num;i += 6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}


}
