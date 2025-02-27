package FirstJavaApp.src.JavaTestClass.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
	
	 public static void main(String[] args) {
	        int[] a = {2,2,1,6,7,8,9,6,7};
	        System.out.println(singleNum(a));
	    }

	 //using Map is Best Choice
	    protected static List<Integer> singleNum(int[] nums) {
	    	
	    	Arrays.sort(nums);
	    	List<Integer> uniqueNmberList = new ArrayList<>();  	
	    	int i=1;
	    	int element =0;
	    	while(i<nums.length) {   		
	    		if(nums[i] == nums[i-1]) {
	    			element = nums[i-1];
	    			System.out.println("element : "+element);
	    		}else if((nums[i] != nums[i-1]) && nums[i-1] != element) {
	    			uniqueNmberList.add(nums[i]);
	    		}
	    		i++;
	    	}
	    	return uniqueNmberList;
	    }
	    
	    
	    protected static List<Integer> singleNumUsingPointers(int[] nums) {    	
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

}
