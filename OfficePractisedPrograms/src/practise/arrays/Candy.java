package practise.arrays;

import java.util.Arrays;

/*
 * There are n children standing in a line, each with a rating. You are tasked to distribute candies to these children under the following rules:
	Each child must have at least one candy.
	Children with a higher rating than their immediate neighbors must receive more candies than those neighbors.
	Objective: Minimize the total number of candies distributed.
 */
public class Candy {
	
	public static void main(String[] args) {
		
		int[] ratings = {1,0,2};
	System.out.println("minimum no of candies required : "+minimumCandiesDistributed(ratings));
	}

	private static int minimumCandiesDistributed(int[] ratings) {	

		int[] candies = new int[ratings.length];		
		Arrays.fill(candies, 1);//each child should have atleast one candy, so filling candies[] with 1 intially


		//iterating from left to right, comparing if current(right) child has high rating than previous(left) child, 
		//adding privous candies+1 to current child
		for(int i=1;i<ratings.length;i++) {
		  if(ratings[i] > ratings[i-1]) {
				candies[i] = candies[i-1]+1;
			}
		}

		//now iterating from right to left because corners will be missed while iterated from left to right 
		for(int i=ratings.length-2;i>=0;i--) {
			if(ratings[i]>ratings[i+1]) {
				candies[i] = Math.max(candies[i], candies[i+1]+1);//doing math.max because, in left to right already candies are assigned to child based on priority from left to right, 
				//so now comparing math.max and taking which ever candies to max (left to right) or (right to left)
			}
		}

		int totalCandies =0;
		for(int num:candies) {
			totalCandies += num;
		}		
		return totalCandies;
	}

}
