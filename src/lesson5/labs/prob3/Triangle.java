package lesson5.labs.prob3;

public class Triangle implements Graph {
	
	private double base;
	private double height;
	
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}

	@Override
	public double ComputeArea() {
		
		return 1/2*base*height;
	}

	
}
