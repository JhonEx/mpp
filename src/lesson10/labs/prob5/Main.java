package lesson10.labs.prob5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		printEmps(Arrays.asList(new Employee("Joe", "Davis", 120000),
							  new Employee("John", "Sims", 110000),
							  new Employee("Joe", "Stevens", 200000),
							  new Employee("Andrew", "Reardon", 80000),
							  new Employee("Joe", "Cummings", 760000),
							  new Employee("Steven", "Walters", 135000),
							  new Employee("Thomas", "Blake", 111000),
							  new Employee("Alice", "Richards", 101000),
							  new Employee("Donald", "Trump", 100000))
		);
//		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
//				          new Employee("John", "Sims", 110000),
//				          new Employee("Joe", "Stevens", 200000),
//		                  new Employee("Andrew", "Reardon", 80000),
//		                  new Employee("Joe", "Cummings", 760000),
//		                  new Employee("Steven", "Walters", 135000),
//		                  new Employee("Thomas", "Blake", 111000),
//		                  new Employee("Alice", "Richards", 101000),
//		                  new Employee("Donald", "Trump", 100000)).stream();


		
//		  System.out.println(emps
//				    .filter(e -> (e.getSalary() > 100000))
//				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
//				  .map(e -> fullName(e))
//				  .sorted()
//				    .collect(Collectors.joining(", ")));
				               
		             

	}
	
//	private static String fullName(Employee e) {
//		return e.getFirstName() + " " + e.getLastName();
//	}

	public static String asString(List<Employee> list){
		return list.stream().filter(e -> EmployeeCompanion.salaryGreaterThan100000(e))
				.filter(e -> EmployeeCompanion.lastNameAfterM(e))
				.map(e -> EmployeeCompanion.fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));
	}

	private static void printEmps(List<Employee> list){
		System.out.println(asString(list));
	}

}
