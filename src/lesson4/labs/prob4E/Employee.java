package lesson4.labs.prob4E;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
/**	private String _name;
	private List<Account> _accounts = new ArrayList<Account>();
	
	public Employee(String name) {
		_name = name;
	}
	
	public List<Account> getAccounts() {
		return _accounts;
	}

	public void addAccount(Account account) {
		_accounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		double updatedBalanceSum = 0;
		for(Account acc : _accounts) {
			updatedBalanceSum += acc.getUpdateBalance();
		}
		return updatedBalanceSum;
	}
	**/
	private String name;
    private  List<Account> listaccount=new ArrayList<Account>();
   

	public String getName() {
		return name;
	}
	
   public Employee(String name) {
		
		this.name = name;
		
	}

public void addAccount(Account a) {
	   listaccount.add(a);
	   
   }
  



public List<Account> getListaccount() {
	return listaccount;
}


public  double computeUpdatedBalanceSum() {
		double sum=0;
		for(Account a : listaccount) {
		   sum+=a.getUpdateBalance();
			
		}
		return sum;
			  
			
	  }



}
