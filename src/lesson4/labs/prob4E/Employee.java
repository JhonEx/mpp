package lesson4.labs.prob4E;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

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
