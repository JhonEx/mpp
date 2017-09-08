package lesson4.labs.prob4E.launch;

import java.util.ArrayList;
import java.util.List;

import lesson4.labs.prob4E.Account;
import lesson4.labs.prob4E.Admin;
import lesson4.labs.prob4E.CheckingAccount;
import lesson4.labs.prob4E.Employee;
import lesson4.labs.prob4E.SavingsAccount;

public class Main {
	
    public static void main(String[] args) {
    	
     Account a=new CheckingAccount(1000, 1, "1");
     Account b=new SavingsAccount(1000, 0.1, "1");
     List<Account> accounts=new ArrayList<>();
     accounts.add(a);
     accounts.add(b);
     Employee c=new Employee("1");
     Employee c1=new Employee("1");
     Employee c2=new Employee("1");
     Employee c3=new Employee("1");
     c.addAccount(a);
     c.addAccount(b);
     c1.addAccount(a);
     c1.addAccount(b);
     c2.addAccount(a);
     c2.addAccount(b);
     c3.addAccount(a);
     c3.addAccount(b);
    
     
     List<Employee> list=new ArrayList<>();
     list.add(c);
     list.add(c1);
     list.add(c2);
     list.add(c3);
     
     
     
    
     
     Admin d=new Admin();
     double sum= d.computeUpdatedBalanceSum(list);
     System.out.println(sum);
     
     
     
    
	}
}
