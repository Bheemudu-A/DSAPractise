package FirstJavaApp.src.JavaTestClass;

import java.util.Arrays;

public class JavaTestClass {

	public static void main(String[] args) {
	System.out.println("Testing Prpject");
	
	int[] arr1 = {1,2,3,4};
	int[] arr2 = {5,6,7,8};
	int[] result = new int[arr1.length+arr2.length];
	
	System.arraycopy(arr1, 0, result, 0, arr1.length);
	System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
	
	System.out.println("Merged Array : "+Arrays.toString(result));

	}

}
