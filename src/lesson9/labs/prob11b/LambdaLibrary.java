package lesson9.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> 
	NAMES_IN = (list, filterSalary, filterNameChar) ->
	list.stream()
	.filter((e) -> e.getSalary() > filterSalary)
	.filter((e) -> e.getLastName().toUpperCase().charAt(0) > filterNameChar)
	.map((e) -> e.getFirstName() + " " + e.getLastName())
	.sorted()
	.collect(Collectors.joining(", "));
}
