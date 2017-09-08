package lesson5.labs.prob2;

import lesson5.labs.prob2.domain.Duck;
import lesson5.labs.prob2.domain.DuckFactory;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Duck[] ducks = {
				DuckFactory.createDuck(DuckFactory.MallardDuck),
				DuckFactory.createDuck(DuckFactory.DecoyDuck),
				DuckFactory.createDuck(DuckFactory.RedheadDuck),
				DuckFactory.createDuck(DuckFactory.RubberDuck),
		};
		for(Duck duck : ducks){
			System.out.println(duck.getClass().getSimpleName());
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
		}
	}
}
