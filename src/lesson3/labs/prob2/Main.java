package lesson3.labs.prob2;


import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Building> buildings = new LinkedList<>();

        Building b1 = new Building(1);
        b1.addApartment(1);
        b1.addApartment(2);
        b1.addApartment(3);
        b1.addApartment(4);
        b1.addApartment(5);
        buildings.add(b1);


        Building b2 = new Building(1);
        b2.addApartment(1);
        b2.addApartment(2);
        b2.addApartment(3);
        b2.addApartment(4);
        b2.addApartment(5);
        buildings.add(b2);

        Landlord landlord = new Landlord(buildings);

        System.out.println("landlord monthly profit: " + landlord.computeMonthProfit());
    }
}
