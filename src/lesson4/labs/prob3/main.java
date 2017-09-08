package lesson4.labs.prob3;

import lesson4.labs.prob3.domain.HRDepartment;

public class main {

	public static void main(String[] args){
		
		int month = 2;
		int year = 2017;
		
		HRDepartment hr = new HRDepartment();
		hr.printSalary(year, month);
	}
}
