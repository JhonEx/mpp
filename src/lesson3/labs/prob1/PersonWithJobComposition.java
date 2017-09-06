package lesson3.labs.prob1;

public class PersonWithJobComposition{

	private Person person;
	private double salary;

    PersonWithJobComposition(String n, double s) {
        person = new Person(n);
        salary = s;
    }

	public double getSalary() {
		return salary;
	}

    public Person getPerson() {
        return person;
    }

    @Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJobComposition)) return false;
		PersonWithJobComposition p = (PersonWithJobComposition)aPerson;
		boolean isEqual = this.person.equals(p.person) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
        PersonWithJobComposition p1 = new PersonWithJobComposition("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.getPerson().equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.getPerson()));
	}


}
