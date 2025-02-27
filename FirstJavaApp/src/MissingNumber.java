import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
        int[] num = {0,1,2,3,5,6};
        
        System.out.println("using inbuilt : "+missingNumberUsingInbult(num));
        
        System.out.println("using Array : "+missingNumber(num));
        
        System.out.println("usingList : "+usingList(num));
    }
    
    
    //need to see
    private static int missingNumberUsingInbult(int[] nums) {
    	
    	int num = nums[nums.length-1];
    	
    	int sum = (num*(num+1))/2;
    	int arrSum =0;
    	
    	for(int i=0;i<nums.length;i++) {
    		arrSum += nums[i];
    		
    	}
    return sum-arrSum;	
    }

    //
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return nums.length;
    }
    
    //using List
    public static int usingList(int[] nums) {
    	Set<Integer> set = new TreeSet<Integer>();
    	
    	for(int num: nums) {
    		set.add(num);
    	}
    	
    	List<Integer> list = new ArrayList<>(set);
    	
    	for(int i=1;i<list.size();i++) {
    		
    		if(list.get(i) != list.get(i-1)+1) {
    			return list.get(i-1)+1;
    		}
    	}
    	return -1;
    }
    
}
