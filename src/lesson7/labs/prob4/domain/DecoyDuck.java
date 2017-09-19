package lesson7.labs.prob4.domain;

public class DecoyDuck extends Duck{
	
	@Override
	public void fly() {
		System.out.println("\tcan not fly");
	}
	
	@Override
	public void quack() {
		System.out.println("\tcan not quack");
	}
}
