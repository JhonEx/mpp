package lesson9.labs.prob10;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class Sub_prob3 {

	public static void main(String[] args) {
		
		IntStream input = IntStream.generate(() -> (new Random()).nextInt()).limit(100);
		
		IntSummaryStatistics intSummaryStatistics = input.summaryStatistics();
		
		System.out.println("max:" + intSummaryStatistics.getMax() + ". min:" + intSummaryStatistics.getMin());
	}
}
