import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SingleNumber {

    public static void main(String[] args) {
        int[] a = {2,2,3,4,1,3,4,7,10};
       //o|p : 1
        System.out.println("Using arrays : "+usingArrays(a));
        System.out.println("using map : "+usingMap(a));
    }

   
    
    
    protected static List<Integer> usingMap(int[] nums) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int num: nums) {
    		map.put(num, map.getOrDefault(num, 0)+1);
    	}
    	
    	for(Integer key : map.keySet()) {
    		
    		if(map.get(key)==1) {
    			list.add(key);
    		}
    	}
    	return list;
    }
    
    //using arrays
    protected static List<Integer> usingArrays(int[] nums){
    	
    	List<Integer> result = new ArrayList<>();
    	
    	for(int i=0;i<nums.length;i++) {
    		boolean isUnique = false;
    		for(int j=0;j<nums.length;j++) {
    			if(i != j && nums[i] == nums[j]) {
    				isUnique = true;
    				break;
    			}   			
    		}

    		if(!isUnique) {
    			result.add(nums[i]);
    		}
    	}
    	
    	return result;
    }
}
