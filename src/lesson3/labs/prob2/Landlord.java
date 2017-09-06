package lesson3.labs.prob2;

import java.util.List;

public class Landlord{
    List<Building> buildings;

    public Landlord(List<Building> buildings){
        this.buildings = buildings;
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public double computeMonthlyProfit(){
        double totalRent = 0.0;
        for (Building building : buildings) {
            totalRent += building.computeMonthlyProfit();
        }
        return totalRent;
    }
}
