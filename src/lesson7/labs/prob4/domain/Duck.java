package lesson7.labs.prob4.domain;

import lesson7.labs.prob4.domain.behavior.FlyBehavior;
import lesson7.labs.prob4.domain.behavior.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior{

	public void swim(){
		System.out.println("\tswimming");
	}
	
	public void display(){
		System.out.println("\tdisplay");
	}
}
