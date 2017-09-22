package lesson10.labs.prob5.soln2;

import lesson10.labs.prob5.Employee;
import lesson10.labs.prob5.EmployeeCompanion;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeCompanionTest{

    @Test
    public void salaryGreaterThan100000(){
        Assert.assertFalse(EmployeeCompanion.salaryGreaterThan100000(new Employee("Joe", "Davis", 10000)));
        Assert.assertTrue(EmployeeCompanion.salaryGreaterThan100000(new Employee("John", "Hims", 110000)));
    }

    @Test
    public void lastNameAfterM(){
        Assert.assertFalse(EmployeeCompanion.lastNameAfterM(new Employee("Joe", "Havis", 10000)));
        Assert.assertTrue(EmployeeCompanion.lastNameAfterM(new Employee("John", "Sims", 110000)));
    }

    @Test
    public void fullName() {
        Assert.assertEquals(EmployeeCompanion.fullName(new Employee("Joe", "Havis", 10000)),"Joe Havis");
        Assert.assertEquals(EmployeeCompanion.fullName(new Employee("John", "Sims", 110000)),"John Sims");
    }
}
