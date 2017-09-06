package lesson3.labs.prob2;

public class Apartment{
    private int floor;

    public Apartment(int floor){
        this.floor = floor;
    }

    public double conputeRent(){
        return 300 * floor;
    }
}
