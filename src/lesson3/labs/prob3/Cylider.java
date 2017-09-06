package lesson3.labs.prob3;

public class Cylider {
	private double height;
	private Circle circle;

   public double computeVolume() {
	   return circle.computeArea()*this.height;
   }

public Cylider(double height, Circle circle) {
	
	this.height = height;
	this.circle = circle;
}
   
 
  
   
}
