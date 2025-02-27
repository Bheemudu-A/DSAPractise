package practise.string;

public class LongestCommonPrefix {

    // Function to find the longest common prefix
    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Adjust the prefix to match the current string
        	String str = strs[i];
        	while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);// -1 is must in end index (prefix.length() - 1), because we are decreasing length 
                System.out.println("prefix : "+prefix);
                
                // If the prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};	
        String result = findLongestCommonPrefix(strs);

        if (result.isEmpty()) {
            System.out.println("There is no common prefix.");
        } else {
            System.out.println("The longest common prefix is: \"" + result + "\"");
        }
    }
}

