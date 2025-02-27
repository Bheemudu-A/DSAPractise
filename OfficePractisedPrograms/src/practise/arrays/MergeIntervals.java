package practise.arrays;

import java.util.*;


/*
 * ⦁	Insert Interval & Merge Intervals
Input: arr = {{1,3},{2,4},{6,8},{9,10}}	Output: {{1, 4}, {6, 8}, {9, 10}}
Sort the intervals using start of the interval
Merge the 2 intervals if previous interval of end is greater than current interval start

 */
//Overlapping Intervals
public class MergeIntervals {
	
	public static List<int[]> mergeIntervals(int[][] intervals) {

		List<int[]> list = new ArrayList<>();

		//sorting not required because input is already sorted
		/*	//java 8
    		Arrays.sort(intervals, (a,b) ->Integer.compare(a[0], b[0]));

    		//java 7
    		Arrays.sort(intervals, new Comparator<int[]>() {	
    			@Override
    			public int compare(int[] a,int b[]) {
    				return Integer.compare(a[0], b[0]);
    			}
			});*/

		//it 0th index of array 
		int[] currentInterval = intervals[0];		
		for(int i=1;i<intervals.length;i++) {

			//from 1st index of array & goes on
			int[] nextInterval = intervals[i];

			//if last element of previous array is greater the 1st element of current array,
			//then make currentInterval last element as max of previous and current arrays max element of last index
			if(currentInterval[1] >= nextInterval[0]) {
				currentInterval[1] = Math.max(currentInterval[1] , nextInterval[1]);
			}else {
				//else merge current interval to list
				list.add(currentInterval);
				currentInterval = nextInterval;	
			}
		}
		//to add last elements
		list.add(currentInterval);
		return list;
	}
    

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        List<int[]> result = mergeIntervals(arr);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval));
        }
    }
}

