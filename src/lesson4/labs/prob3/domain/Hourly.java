package lesson4.labs.prob3.domain;

public class Hourly extends Employee{

	private int hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(){
		this.hourlyWage = 10;
		this.hoursPerWeek = 50;
	}
	
	@Override
	double calcGrossPay(int month, int year) {
		
		return hourlyWage * hoursPerWeek;
	}

	public void print(){
		System.out.println("hourly");
	}
}
