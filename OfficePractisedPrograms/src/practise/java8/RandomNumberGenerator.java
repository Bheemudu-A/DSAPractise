package practise.java8;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] randomElements = IntStream.generate(() -> random.nextInt(100)+1).limit(5).toArray();
		
		System.out.println("Arr : "+Arrays.toString(randomElements));
	}

}
