import java.util.Arrays;

public class Swapping {

	
	public static void main(String[] args) {
		swappingTwoNmbrs(5, 6);
		
		int arr[] = {1,2,3,4,5,6};
		System.out.println("Arrays Swap : "+Arrays.toString(arraySwapping(arr)));
	}

	private static void swappingTwoNmbrs(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("After swapping : "+a+" "+b);
	//without using 3rd element	
	/*	a = a+b;
		b = a-b;
		a =a-b;*/
		
		b= a+b-(a=b);
		
		System.out.println("After swapping : "+a+" "+b);
	}
	
	private static int[] arraySwapping(int[] arr) {
		
		for(int i=0;i<arr.length-1;i+=2) {
			arr[i+1] = arr[i]+arr[i+1]-(arr[i]=arr[i+1]);
		}
		
		return arr;
	}
	
	
}
