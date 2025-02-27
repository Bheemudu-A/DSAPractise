import java.util.stream.Stream;

public class Fibonaci {
	
	public static void main(String[] args) {
		
		int n = 10; // Number of Fibonacci numbers to generate

        // Generate Fibonacci series
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]}) // Seed and function
              .limit(n) // Limit the series to 'n' numbers
              .map(fib -> fib[0]) // Extract the first number of the pair
              .forEach(System.out::println); // Print the numbers
	}

}
