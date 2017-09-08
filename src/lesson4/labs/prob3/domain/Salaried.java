package lesson4.labs.prob3.domain;

class Salaried extends Employee{

	private int salary;
	
	public Salaried(){
		this.salary = 500;
	}
	
	@Override
	double calcGrossPay(int month, int year) {
		return salary;
	}

	public void print(){
		System.out.println("salaried");
	}
}
