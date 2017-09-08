package lesson4.labs.prob3;

import java.util.ArrayList;
import java.util.List;

import lesson4.labs.prob3.domain.Commissioned;
import lesson4.labs.prob3.domain.Employee;
import lesson4.labs.prob3.domain.Hourly;
import lesson4.labs.prob3.domain.Order;
import lesson4.labs.prob3.domain.Salaried;

public class main {

	public static void main(String[] args){
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Hourly());
		employees.add(new Salaried());
		
		Commissioned commissioned = new Commissioned();
		commissioned.addOrder(new Order(1, "2017-1", 1000));
		commissioned.addOrder(new Order(1, "2017-2", 2000));
		commissioned.addOrder(new Order(1, "2017-3", 3000));
		employees.add(commissioned);
		
		int month = 2;
		int year = 2017;
		for(Employee employee : employees){
			employee.print();
			System.out.println(employee.calcCompensation(month, year).getNetPay());
		}
	}
}
