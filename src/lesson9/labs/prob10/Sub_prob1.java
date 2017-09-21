package lesson9.labs.prob10;

import java.util.stream.IntStream;

public class Sub_prob1 {

	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).limit(1).distinct();
		ones.forEach(System.out::println);
	}
		
}
