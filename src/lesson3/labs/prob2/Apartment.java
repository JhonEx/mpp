package lesson3.labs.prob2;

public class Apartment{
    private int floor;

    public Apartment(int floor){
        this.floor = floor;
    }

    public double conputeMonthRent(){
        return 300 * floor;
    }
}
