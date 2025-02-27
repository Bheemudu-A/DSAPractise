import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InterSectionOfTwoArrays {

	
	public static void main(String[] args) {
		
		int[] nums1 = {3,4,1,6,2,7,4,10,4,2};
		int[] nums2 = {9,6,3,1,4,4};
		
		System.out.println("CommonOf Two Arrays : "+Arrays.toString(intersect(nums1, nums2)));
		
		System.out.println("Using ArrayList : "+Arrays.toString(intersetArrayUsingList(nums1, nums2)));
	}
	

	//without using extra space
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int l1 =nums1.length, l2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
    
    
    //using array List
   private static int[] intersetArrayUsingList(int[] nums1, int[] nums2){
    	
	   Set<Integer> set = new TreeSet<>();
	   List<Integer> list = new ArrayList<>();
	   
	   for(int num : nums1) {
		   set.add(num);
	   }
	   
	   for(int num2 : nums2) {
		   if(set.contains(num2)) {
			   list.add(num2);
		   }
	   }
	   
	   int[] arr = new int[list.size()];
	   
	   int i=0;
	   for(int num : list) {
		   arr[i++] =num;
	   }
	   return arr;
    }
}
