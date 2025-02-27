import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("ArrayProduct expect itself : "+ Arrays.toString(productOfArray(arr)));
	}

	private static int[] productOfArray(int[] arr) {	
		int product =1;	
		for(int i=0;i<arr.length;i++) {
			product *= arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = product/arr[i];
		}
		return arr;
	}
}
