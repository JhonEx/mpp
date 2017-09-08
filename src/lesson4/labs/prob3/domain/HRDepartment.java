package lesson4.labs.prob3.domain;

import java.util.ArrayList;
import java.util.List;

public class HRDepartment {

	private List<Employee> employees;
	private EmployeeFactory employeeFacgtory;
	
	public HRDepartment(){
		employees = new ArrayList<Employee>();
		employeeFacgtory = new EmployeeFactory();
		initEmployee();
	}
	
	public void initEmployee(){
		
		employees.add(employeeFacgtory.createHourly());
		employees.add(employeeFacgtory.createSalaried());		
		employees.add(employeeFacgtory.createCommissioned());
	}
	
	public void printSalary(int year, int month){
		
		for(Employee employee : employees){
			employee.print();
			System.out.println(employee.calcCompensation(month, year).getNetPay());
		}
	}
}
