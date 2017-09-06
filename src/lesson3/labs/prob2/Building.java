package lesson3.labs.prob2;


import java.util.LinkedList;
import java.util.List;

public class Building{
    private double cost;
    private List<Apartment> apartments;

    public Building(double cost) {
        this.cost = cost;
        this.apartments = new LinkedList<>();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public void addApartment(int floor) {
        addApartment(new Apartment(floor));
    }

    public double computeMonthlyProfit() {
        double totalRent = 0.0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.conputeRent();
        }
        return totalRent - cost;
    }
}
