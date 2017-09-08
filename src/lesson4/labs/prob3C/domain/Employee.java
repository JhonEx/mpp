package lesson4.labs.prob3C.domain;

abstract class Employee {

	int empId;
	
	abstract double calcGrossPay(int month, int year);
	
	public Paycheck calcCompensation(int month, int year){
		
		double grossPay = calcGrossPay(month, year);
		Paycheck payCheck = new Paycheck(grossPay);
		
		return payCheck;
	}
	
	public void print(){
		System.out.println("employee");
	}
}
