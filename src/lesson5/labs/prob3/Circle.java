package lesson5.labs.prob3;

public class Circle implements Graph {
	
	
	private double  radius ;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double ComputeArea() {
		// TODO Auto-generated method stub
		  return Math.PI*radius*radius;
		

	}

	
}
