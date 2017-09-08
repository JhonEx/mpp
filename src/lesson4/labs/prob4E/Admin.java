
package lesson4.labs.prob4E;

import java.util.List;

public class Admin {
	
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum=0;
		for(Employee a:list) {
		   sum+=a.computeUpdatedBalanceSum();
			
		}
		
		return sum;
	}

}
