package lesson5.labs.prob2.domain;

import lesson5.labs.prob2.domain.behavior.FlyWithWings;
import lesson5.labs.prob2.domain.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
}
