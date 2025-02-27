package practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * n this problem, you are given two arrays, alice and bob, representing the number of candies in two bags.
 *  Each person (Alice and Bob) can take candies from one or both bags. 
 *  The goal is to find a way to redistribute candies such that both people end up with the same total number of candies.
 *  The challenge is to determine the most efficient way to do this redistribution.
 */
public class Candies {
	
	public static void main(String[] args) {
		
		int[] alice = {1,2}; //{2}, {1,3}; ex: op = [2,3]
		int[] bob = {2,3};
		
	System.out.println("fair swap : "+Arrays.toString(fairCandySwap(alice, bob)));
	}

	private static int[] fairCandySwap(int[] alice, int[] bob) {
		
		int aliceSum =0;
		int bobSum =0;
		List<Integer> bobList = new ArrayList<>();
		
		for(int element : alice) {
			aliceSum += element;			
		}
		
		for(int element: bob) {
			bobSum += element;
			bobList.add(element);
		}
		
		//target should be even
		int target = (aliceSum+bobSum)/2;
		
		for(int it : alice) {			
			int reqElement = target-(aliceSum-it);
			if(bobList.contains(reqElement)) {
				return new int[] {it, reqElement};
			}
		}
	 return new int[] {};
	}

}
