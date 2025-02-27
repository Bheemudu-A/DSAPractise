import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsRequired {

	public static void main(String[] args) {		
		int[] arr = {2,8,5,4};//minimum swaps required to sort an array
		System.out.println("MinimumSwaps Req : "+minSwaps(arr));
		
	}
	
	public static int minSwaps(int nums[]){
		
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] temp = nums.clone();//Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(temp);
        int i=0;
        for(int number: temp){
            hash.put(number, i);
            i++;
        }
        
        int left=0,ans =0;
        
        while(left<nums.length){       	
            if(left==hash.get(nums[left])){
                left++; //note: we should increament left only in if() not in else() below after swapping again we need to check it 
            }else{
                int tem = nums[hash.get(nums[left])];
                nums[hash.get(nums[left])] = nums[left];
                nums[left] = tem;
                ans++;
            }
        }
        return ans;
    }
}
