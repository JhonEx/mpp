package lesson5.labs.prob2.domain.behavior;

public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}

}
