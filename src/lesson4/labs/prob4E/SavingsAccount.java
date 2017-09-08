package lesson4.labs.prob4E;

public class SavingsAccount extends Account{
	

	private double balance;
	private double interestRate;
	private String acctId;
	
	
	public SavingsAccount(double balance, double interestRate, String acctId) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}


	@Override
	String getAcountID() {
		// TODO Auto-generated method stub
		return acctId;
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	@Override
	double getUpdateBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

}
