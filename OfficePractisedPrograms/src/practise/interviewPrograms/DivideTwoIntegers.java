package practise.interviewPrograms;



public class DivideTwoIntegers {
	
	public static void main(String[] args) {
		int dividend = 10;
		int divisor = 3;

		int result = divide(dividend, divisor);
		System.out.println("Quotient of " + dividend + " / " + divisor + " is: " + result);
	}

	public static int divide(int dividend, int divisor) {
		// Handle edge cases
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE; // Avoid overflow
		}

		// Use logarithms for division
		double quotient = Math.exp(Math.log(Math.abs(dividend)) - Math.log(Math.abs(divisor)));

		// Determine the sign
		boolean isNegative = (dividend < 0) ^ (divisor < 0);

		// Apply sign and clamp to integer range
		int result = (int) quotient;
		return isNegative ? -result : result;
	}
}
