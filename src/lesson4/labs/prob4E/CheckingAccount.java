package lesson4.labs.prob4E;

public class CheckingAccount extends Account{
	
	private double balance;
	private double monthlyFee;
	private String acctId;
	

	public CheckingAccount(double balance, double monthlyFee, String acctId) {
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.acctId = acctId;
	}

	@Override
	String getAcountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double getUpdateBalance() {
		// TODO Auto-generated method stub
		return balance - monthlyFee;
	}
	
}
