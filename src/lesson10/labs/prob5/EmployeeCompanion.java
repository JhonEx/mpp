package lesson10.labs.prob5;

public class EmployeeCompanion{
    public static boolean salaryGreaterThan100000(Employee e){
        return e.getSalary() > 100000;
    }

    public static boolean lastNameAfterM(Employee e){
        return e.getLastName().charAt(0) > 'M';
    }

    public static String fullName(Employee e) {
        return e.getFirstName() + " " + e.getLastName();
    }
}
