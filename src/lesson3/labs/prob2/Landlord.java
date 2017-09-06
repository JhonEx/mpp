package lesson3.labs.prob2;

import java.util.List;

public class Landlord{
   private List<Building> buildings;

    public Landlord(List<Building> buildings){
        this.buildings = buildings;
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public double computeMonthProfit(){
        double totalRent = 0.0;
        for (Building building : buildings) {
            totalRent += building.computeMonthProfit();
        }
        return totalRent;
    }
}
