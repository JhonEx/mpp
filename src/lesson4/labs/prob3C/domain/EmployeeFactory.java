package lesson4.labs.prob3C.domain;

public class EmployeeFactory {

	public Employee createHourly(){
		return new Hourly();
	}
	
	public Employee createSalaried(){
		return new Salaried();
	}
	
	public Employee createCommissioned(){
		Commissioned commissioned = new Commissioned();
		commissioned.addOrder(new Order(1, "2017-1", 1000));
		commissioned.addOrder(new Order(1, "2017-2", 2000));
		commissioned.addOrder(new Order(1, "2017-3", 3000));
		return commissioned;
	}
}
