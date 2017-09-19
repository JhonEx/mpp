package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon{
    private double side;

    public EquilateralTriangle(int side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double computePerimeter() {
        return computePolygonPerimeter();
    }

    @Override
    public double[] getSides() {
        return new double[]{side,side,side};
    }
}
