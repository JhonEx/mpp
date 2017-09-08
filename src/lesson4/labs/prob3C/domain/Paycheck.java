package lesson4.labs.prob3C.domain;

final class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public Paycheck(double grossPay){
		this.grossPay = grossPay;
		this.fica = 0.23;
		this.state = 0.05;
		this.local = 0.01;
		this.medicare = 0.03;
		this.socialSecurity = 0.075;
	}
	
	public double getNetPay(){
		return grossPay * (1 - fica - state - local - medicare - socialSecurity);
	}
	
	public void print(){
		
	}
}
