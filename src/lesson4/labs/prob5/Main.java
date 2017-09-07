package lesson4.labs.prob5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
    public static void main(String[] args) {
    	
     Account a=new CheckingAccount(1000, 1, "1");
     Account b=new SavingsAccount(1000, 0.1, "1");
     List<Account> accounts=new ArrayList<>();
     accounts.add(a);
     accounts.add(b);
     Employee c=new Employee("1", accounts);
     Employee c1=new Employee("1", accounts);
     Employee c2=new Employee("1", accounts);
     Employee c3=new Employee("1", accounts);
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
