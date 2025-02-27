 package practise.arrays;

import java.util.*;

/*
 * ⦁	Non-overlapping Intervals
Input: interval arr[] = { {1, 3}, {2, 4}, {3, 5}, {7, 9} } 	Output: [5, 7]
Sort the intervals using start of the interval
If the prev interval end is less than the current interval start then add (prev end, curr start) as an interval into list.

 */

public class NonOverlappingIntervals {
    public static List<int[]> findNonOverlappingGaps(int[][] intervals) {
        List<int[]> result = new ArrayList<int[]>();

        if (intervals.length <= 1) return result;

        // Step 1: Sort intervals by start time
      //java 8
	//	Arrays.sort(intervals, (a,b) ->Integer.compare(a[0], b[0]));
        
     /*   Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });*/

        // Step 2: Find gaps between intervals
        for (int i = 1; i < intervals.length; i++) {
            int prevEnd = intervals[i - 1][1];
            int currStart = intervals[i][0];

            if (prevEnd < currStart) {
                // There's a gap between the intervals
                result.add(new int[] {prevEnd, currStart});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {3, 5}, {7, 9}};
        List<int[]> gaps = findNonOverlappingGaps(arr);

        System.out.println("Non-Overlapping Gaps:");
        for (int[] gap : gaps) {
            System.out.println(Arrays.toString(gap));
        }
    }
}
