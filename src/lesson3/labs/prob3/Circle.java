package lesson3.labs.prob3;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return Math.PI*this.radius*this.radius;
	}
}