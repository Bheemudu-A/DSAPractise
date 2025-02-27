import java.util.Arrays;
import java.util.TreeSet;

public class Thirdmax {

	//if array contains only two elements should return top element
	public static void main(String[] args) {
		//{1,2,2}
		System.out.println("Third max is : "+thirdMax(new int[] {1,2,2,3,4,5}));
		System.out.println("Third max using array : "+usingArray(new int[] {1,2,2}));
		
		int id = 1;
		
		String day = switch(id) {
		case 1 -> "Monday";
		case 2 -> "tuesday";
		default -> throw new IllegalArgumentException("Unexpected value: " + id);	
		};
		System.out.println("id : "+id);
	}
	
	//using treeset
	public static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int num: nums)
              treeSet.add(num);

              if(treeSet.size()<3){
                 return treeSet.last();
              }else{
                return treeSet.lower(treeSet.lower(treeSet.last()));
              }
    }
	
	//using array
	public static int usingArray(int[] nums) {		
        int max=0;
        int secMax=0;
        int thirdMax=0;   
        Arrays.sort(nums);
        if(nums.length<3) {
        	return nums[nums.length-1];
        }

        for(int i=0;i<nums.length;i++) {      	
        	if(nums[i] >= max) {
        		thirdMax = secMax;
        		secMax =max;
        		max = nums[i];
        	}else if(nums[i] > secMax && nums[i] != max) {
        		secMax = nums[i];
        	}

        }
      return thirdMax;
    }
}
