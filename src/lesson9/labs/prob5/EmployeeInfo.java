package lesson9.labs.prob5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EmployeeInfo {

	static enum SortMethod {BYNAME, BYSALARY};
	private Map<SortMethod, Pair<Function, Function>> processMap;
	private List<Employee> emps;
	
	public EmployeeInfo() {
		
		emps = new ArrayList<>();
		emps.add(new Employee("Joe", 500));

		emps.add(new Employee("Jack", 2000));
		emps.add(new Employee("Jack", 500));
		emps.add(new Employee("Joe", 1000));

		emps.add(new Employee("Joe", 5000));
		emps.add(new Employee("Jack", 1000));
		
		Function<Employee, String> byName = Employee::getName;
		Function<Employee, Integer> bySalary = Employee::getSalary;
		
		processMap = new HashMap<>();
		processMap.put(SortMethod.BYNAME, new Pair<>(byName, bySalary));
		processMap.put(SortMethod.BYSALARY, new Pair<>(bySalary, byName));
	}
	
	public static void main(String[] args) {
		
		
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.sort(SortMethod.BYNAME);
		
		System.out.println(employeeInfo.emps);
	}
	
	public void sort(final SortMethod method){
		Collections.sort(emps, 
				Comparator.comparing(processMap.get(method).first).
				thenComparing(processMap.get(method).second));
	}
	
	final static class Pair<S,T> implements Serializable{
		
		S first;
		T second;
		Pair(S s, T t) {
			first = s;
			second = t;
		}
		@Override 
		public boolean equals(Object ob) {
			if(ob == null) return false;
			if(this == ob) return true;
			if(ob.getClass() != getClass()) return false;
			@SuppressWarnings("unchecked")
			Pair<S,T> p = (Pair<S,T>)ob;
			return p.first.equals(first) && p.second.equals(second);
		}
		
		@Override 
		public int hashCode() {
			return first.hashCode() + 5 * second.hashCode();
		}
		@Override
		public String toString() {
			return "(" + first.toString() + ", " + second.toString() + ")";
		}
		private static final long serialVersionUID = 5399827794066637059L;
	}
}
