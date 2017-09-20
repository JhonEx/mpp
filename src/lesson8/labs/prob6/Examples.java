package lesson8.labs.prob6;
import java.util.Comparator;
import java.util.function.*;
public class Examples {


	Function<String, String> toupper1 = (String x) -> x.toUpperCase();
	Function<String, String> toupper2 = String::toUpperCase;
	
	Function<Employee, String> employee1 = e -> e.getName();
	Function<Employee, String> employee2 = Employee::getName;
	
	BiConsumer<Employee, String> setName1 = (e,s) -> e.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName;
	
	BiFunction<Integer, Integer, Double> pow1 = (x,y) -> Math.pow(x,y);
	BiFunction<Integer, Integer, Double> pow2 = Math::pow;
	
	Function<Apple, Double> weight1 = (Apple a) -> a.getWeight();
	Function<Apple, Double> weight2 = Apple::getWeight;
	
	Function<String, Integer> parserint1 = x -> Integer.parseInt(x);
	Function<String, Integer> parserint2 = Integer::parseInt;
	
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> empComp1 = (e1, e2) -> comp.compare(e1,e2);
	Comparator<Employee> empComp2 = comp::compare;
	
	
	public void evaluator() {
		Employee  employee = new Employee("July", 10000);
		Apple apple = new Apple(1.0);
		System.out.println(toupper2.apply("july"));
		setName1.accept(employee,"coco");
		System.out.println(employee.getName());
		System.out.println(pow1.apply(2, 3));
		System.out.println(weight1.apply(apple));
		System.out.println(parserint1.apply("1"));
		System.out.println(empComp1.compare( employee, new Employee("mike", 10001)));
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
	}
}
