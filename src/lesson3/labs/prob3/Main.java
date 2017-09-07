package lesson3.labs.prob3;

public class Main {
	
	  public static  void main(String [] args) {
	    	
	    	Circle c=new Circle(3);
	    	Cylider cy=new Cylider(4,c);
	    	
	    	System.out.println(cy.computeVolume());	 
	    }

}
