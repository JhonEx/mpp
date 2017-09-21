package lesson9.labs.prob10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sub_prob2 {

	public static void main(String[] args) {
	
		List<String> input = new ArrayList<>();
		input.add("Bill");
		input.add("Thomas");
		input.add("Mary");
		
		System.out.println(input.stream().collect(Collectors.joining(", ")));
	}
}
