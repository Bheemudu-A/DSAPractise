
public class SecondMaxSum {
	
	public static void main(String[] args) {
		int[] arr = {1,9,3,5,6,20};
		System.out.println("2nd max nmbr is : "+find2ndMaxNmbr(arr));
		
	}

	private static int find2ndMaxNmbr(int[] arr) {

		int max1 = 0;
		int max2=0; 
		int i=0;

		while(i<arr.length) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			i++;
		}

		return max2;

	}

}
