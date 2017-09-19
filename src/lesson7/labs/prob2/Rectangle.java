package lesson7.labs.prob2;

public final class Rectangle implements Polygon {//ClosedCurve,
	final private double width;
	final private double length;

	@Override
	public double[] getSides() {
		return new double[]{width,width,length,length};
	}

//	@Override
//	public double computePerimeter() {
//		double area =  width * length;
//		return area;

//		return 2 * length + 2 * width;
//	}
	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
