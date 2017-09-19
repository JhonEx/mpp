package lesson7.labs.prob4.domain.behavior;

public interface QuackBehavior {

	default void quack() {
		System.out.println("\tquacking");
	}
}
