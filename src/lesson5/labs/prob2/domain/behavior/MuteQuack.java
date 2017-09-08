package lesson5.labs.prob2.domain.behavior;

public class MuteQuack implements QuackBehavior{

	public void quack(){
		System.out.println("\tcannot quack");
	}
}
