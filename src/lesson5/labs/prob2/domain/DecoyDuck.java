package lesson5.labs.prob2.domain;

import lesson5.labs.prob2.domain.behavior.CannotFly;
import lesson5.labs.prob2.domain.behavior.MuteQuack;

public class DecoyDuck extends Duck{

	public DecoyDuck(){
		this.flyBehavior = new CannotFly();
		this.quackBehavior = new MuteQuack();
	}
}
