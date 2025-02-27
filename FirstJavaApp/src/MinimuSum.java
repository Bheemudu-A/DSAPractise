import java.util.Arrays;

public class MinimuSum {

	//https://getsdeready.com/courses/design-dsa-combined/lesson/minimum-sum-of-four-digit-number-after-splitting-digits-2/
	//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/	
public static void main(String[] args) {
		
		System.out.println("Minm Sum : "+minimumSum(3247));
		System.out.println("Using String : "+usingString(3247));
	}
	
	public static int minimumSum(int num) {
        int[] arr = new int[4];
        int i=0;
        while(num>0){
            int rem = num%10;
           arr[i] = rem;
            num = num/10;
            i++;
        }
        Arrays.sort(arr);
       return (arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
    }
	
	
	//Using String
	public static int usingString(int num) {
		String val = String.valueOf(num);		
		int[] arr = new int[val.length()];
		
		for(int i=0;i<val.length();i++) {	
			arr[i] = Integer.valueOf(val.charAt(i)-'0');
		}
		
		Arrays.sort(arr);
		return (arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
	}
}
