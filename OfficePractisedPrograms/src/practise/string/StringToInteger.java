package practise.string;

public class StringToInteger {
	
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        // Remove leading and trailing whitespaces
        s = s.trim();

        // Return 0 if the string is empty after trimming
        if (s.isEmpty()) return 0;

        int index = 0;
        int sign = 1;
        int result = 0;

        // Check for the sign
        if (s.charAt(index) == '-') {
            sign =  -1;
            index++;
        }

        // Process digits and stop at the first non-digit
        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) break;

            int digit = c - '0';

            // Check for overflow/underflow before updating the result
       /*     if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }*/
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));                // Output: 42
        System.out.println(myAtoi("   -42"));            // Output: -42
        System.out.println(myAtoi("4193 with words"));   // Output: 4193
        System.out.println(myAtoi("words and 987"));     // Output: 0
  //      System.out.println(myAtoi("-91283472332"));      // Output: -2147483648 (Integer.MIN_VALUE)
  //      System.out.println(myAtoi("21474836460"));       // Output: 2147483647 (Integer.MAX_VALUE)
    }
}

