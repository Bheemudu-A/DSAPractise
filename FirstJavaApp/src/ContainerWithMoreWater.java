
public class ContainerWithMoreWater {

	//two pointer model 1 b
	//bharath chandra 150 challenge
	public static void main(String[] args) {
		
	int[] arr = {1,8,6,2,5,4,3,7,9};
		
		System.out.println("MaxArea : "+ containerOfMoreWater(arr));
	}

	private static int containerOfMoreWater(int[] arr) {		
		int i=0;
		int j=arr.length-1;
		int maxArea = 0;
		
		while(i<j) {	
			int area = Math.min(arr[i], arr[j])*(j-i);//picking min height b/w two numbers and multipling with length diff
			maxArea = Math.max(maxArea, area);
			
			if(arr[i]<arr[j]) {
				i++;
			}else
				j--;
		}
		
		return maxArea;
	}
}
