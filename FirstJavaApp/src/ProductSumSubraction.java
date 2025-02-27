
public class ProductSumSubraction {

	
	 public static void main(String[] args) {	
			System.out.println("subtract Sum from product : "+subtractProductAndSum(12345));
		}
	 
	 public static int subtractProductAndSum(int n) {
		 int product = 1;
		 int sum = 0;

		 while(n>0){
			 int rem = n%10;
			 product *= rem;
			 sum += rem;
			 n=n/10;
		 }
		 return product-sum;
	 }
}
