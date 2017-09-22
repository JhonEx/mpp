package lesson10.labs.prob5.soln1;

import lesson10.labs.prob5.Employee;
import lesson10.labs.prob5.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AsStringTest{

    @Test
    public void asString() {
        Assert.assertEquals(Main.asString(
                Arrays.asList(new Employee("Joe", "Davis", 10000),
                        new Employee("John", "Hims", 110000),
                        new Employee("Jim", "Samson", 110000),
                        new Employee("Joe", "Stevens", 200000))
                ),
                "Jim Samson, Joe Stevens");
    }
}
