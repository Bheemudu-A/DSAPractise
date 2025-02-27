package practise.arrays;

public class MaxProductofSubArray {
	
	public static void main(String[] args) {
		
		int[] arr = {-2,6,-3,-10,10,0,2};
		int maxElement =3;
			
	System.out.println("max product of 3 : "+maxProductofSubArray(arr, maxElement));
	}

	private static int maxProductofSubArray(int[] arr, int maxElement) {		
		int maxProduct = 1;
		int prod = 1;
		
		for(int i=0;i<maxElement;i++) {
			maxProduct *= arr[i];
		}
		
		for(int i=3;i<arr.length;i++) {
			  prod = (maxProduct*arr[i])/arr[i-maxElement];
			  maxProduct = Math.max(maxProduct, prod);
		}
		return maxProduct;
	}

}
