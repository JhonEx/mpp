package lesson4.labs.prob5;

import java.util.Iterator;
import java.util.List;

public class Employee {
	
	private String name;
    public static  List<Account> listaccount;
   

	public String getName() {
		return name;
	}
	
   public Employee(String name, List<Account> listaccount) {
		
		this.name = name;
		this.listaccount = listaccount;
	}

public void addAccount(Account a) {
	   listaccount.add(a);
	   
   }
   public List<Account> getListaccount() {
	return listaccount;
}

public void setListaccount(List<Account> listaccount) {
	this.listaccount = listaccount;
}

public static double computeUpdatedBalanceSum() {
		double sum=0;
		for(Account a:listaccount) {
		   sum+=a.getUpdateBalance();
			
		}
		return sum;
			  
			
	  }
}
