package practise.string;


/*
 * To check if a string is a palindrome while considering spaces and special characters,
 *  you can preprocess the string by ignoring non-alphanumeric characters and treating the comparison
 *   in a case-insensitive manner. Here’s a Java program for this:


 */
public class PalindromSentence {
	
	
	public static void main(String[] args) {
		String str = "A man, a plan, a canal, Panama!";
		if (isPalindrome(str)) {
			System.out.println("\"" + str + "\" is a palindrome.");
		} else {
			System.out.println("\"" + str + "\" is not a palindrome.");
		}
		
	}
    
  
	//remove all spaces, numericals before check	 	
	public static boolean isPalindrome(String str) {
		// Convert the string to lowercase and remove non-alphanumeric characters
		String filteredStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//replaceAll("[^a-zA-Z0-9]", ""): Removes all non-alphanumeric characters (spaces, punctuation, etc.).

		System.out.println("filteredStr : "+filteredStr);
		// Use two-pointer technique to check for palindrome
		int left = 0, right = filteredStr.length() - 1;
		while (left < right) {
			if (filteredStr.charAt(left) != filteredStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
