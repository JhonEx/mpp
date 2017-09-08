package lesson5.labs.prob2.domain;

import lesson5.labs.prob2.domain.behavior.FlyBehavior;
import lesson5.labs.prob2.domain.behavior.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void quack(){
		if(quackBehavior != null){
			quackBehavior.quack();
		}
	}
	
	public void swim(){
		System.out.println("\tswimming");
	}
	
	public void fly(){
		if(flyBehavior!=null){
			flyBehavior.fly();
		}
	}
	
	public void display(){
		System.out.println("\tdisplay");
	}
}
