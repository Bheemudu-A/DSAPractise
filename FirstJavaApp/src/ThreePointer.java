import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreePointer {
	
	public static void main(String[] args) {
		//three sum
		//finding possible pairs whose sum equals to 0
		int[] arr = {0,6,-2,-4,2,4,4,-2,6};
		int sum = 0;
	System.out.println("ThreeSum obtained numbers: "+threeSum(arr, sum));
	}

	private static List<List<Integer>> threeSum(int[] arr, int sum) {
		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<>();

		//	System.out.println("arr : "+arr[i]);

		for(int i=0;i<arr.length-2;i++) {
			if(i!=0 && arr[i]==arr[i-1]) {
				i++;
				continue;
			}
			int j =i+1,k=arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]==sum) {
					result.add(Arrays.asList(arr[i],arr[j],arr[k]));
					if(arr[j]==arr[j+1])j++;
					if(arr[k]==arr[k-1])k--;
					j++;k--;

				}else if(arr[i]+arr[j]+arr[k]<sum) {
					j++;
				}else {
					k--;
				}
			}
		}
		return result;
	}
}
