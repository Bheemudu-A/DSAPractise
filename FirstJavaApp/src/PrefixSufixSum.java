import java.util.Arrays;

public class PrefixSufixSum {

    public static void main(String[] args) {
        int[] arr = new int[] {1,7,2,5,6,9,11,13};

        findingprefixSum(arr, 1, 4); // adding 0 to n
        findingsuffixSum(arr, 6, 2);//adding n to 0
    }

    protected static void findingprefixSum(int[] arr,int start, int end) {
        int[] sum = new int[arr.length];
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i==0)
                sum[i]=arr[i];
            else
                sum[i]=sum[i-1]+arr[i];
        }
            if(start!=0)
                prefixSum = sum[end]-sum[start-1];
            else
                prefixSum=sum[end];
        System.out.println(prefixSum);

    }

    protected static void findingsuffixSum(int[] arr,int start, int end) {

    	int[] sum = new int[arr.length];
    	int sufixSum = 0;

    	for(int i=arr.length-1;i>=0;i--){

    		if(i==arr.length-1)
    			sum[i]=arr[i];
    		else
    			sum[i]=sum[i+1]+arr[i];
    	}
    	System.out.println(Arrays.toString(sum));

    	if(start != (sum.length-1)){
    		sufixSum =  sum[end]-sum[start+1];
    	}else
    		sufixSum = sum[end];
    	System.out.println(sufixSum);
    }

}
