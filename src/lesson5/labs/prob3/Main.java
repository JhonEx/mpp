package lesson5.labs.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String argv[]) {
    	List <Graph> list=new ArrayList<Graph>();
    	list.add(new Circle(1));
    	list.add(new Rectangle(1,2));
    	list.add((Graph) new Triangle(1, 2));
    	double sum = 0.0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i).ComputeArea();
		}
		System.out.println("the sum of area is :" + sum);
    	
    
    	
    }
}
