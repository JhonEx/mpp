package lesson5.labs.prob2.domain;

import lesson5.labs.prob2.domain.behavior.FlyWithWings;
import lesson5.labs.prob2.domain.behavior.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
}
