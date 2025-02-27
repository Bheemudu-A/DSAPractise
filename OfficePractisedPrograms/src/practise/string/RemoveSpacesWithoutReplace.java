package practise.string;

public class RemoveSpacesWithoutReplace {
    public static void main(String[] args) {
        String str = "Hello World Welcome To Java Coding";

        // Remove spaces without using replace
        String result = removeSpaces(str);

        System.out.println("String without spaces: " + result);
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Append non-space characters to the StringBuilder
            if (ch != ' ') {
                sb.append(ch);
            }
        }

        // Convert StringBuilder to string and return
        return sb.toString();
    }
}

