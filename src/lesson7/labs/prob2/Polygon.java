package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve{
    double[] getSides();
    default double computePerimeter(){
        double perimeter = 0;
        for(double d:getSides()){
            perimeter += d;
        }

        return perimeter;
    }
}
