import java.util.Arrays;

public class MovingZerosToEnd {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,0,3,0,0,9,5,0};
		System.out.println("Zeros at end :  "+Arrays.toString(zeromMovingtoEnd(arr)));
	}

	private static int[] zeromMovingtoEnd(int[] arr) {

		int count = 0;		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				count++;
			else
				arr[j++] = arr[i];
		}
		while(j<arr.length) {
			arr[j++] = 0;
		}
		return arr;
	}



}
