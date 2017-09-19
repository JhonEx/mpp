package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve{
    private double semiMajorAixs;
    private double E;

    public Ellipse(double a, double E){
        this.semiMajorAixs = a;
        this.E = E;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiMajorAixs * E;
    }

    public double getSemiMajorAixs() {
        return semiMajorAixs;
    }

    public double getE() {
        return E;
    }
}
