package lesson9.labs.prob14;

public class Main {
	public static void main(String[] args) {
		MySingletonLazy a = MySingletonLazy.getInstance();
		MySingletonLazy b = MySingletonLazy.getInstance();

		System.out.println("instance a = instance b ?  " + (a == b));
	}
}
//