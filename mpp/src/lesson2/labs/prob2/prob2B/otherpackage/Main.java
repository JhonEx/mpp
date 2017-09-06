package lesson2.labs.prob2.prob2B.otherpackage;

import java.util.*;

import lesson2.labs.prob2.prob2B.Order;

public class Main {

	public static void main(String[] args) {
		Order order1 = new Order(1, 4);
		order1.addOrderLine(1);
		
		Order order2 = new Order(3, 2);
		order2.addOrderLine(2);
		order2.addOrderLine(3);
		
		Order order3 = new Order(1, 1);
		order3.addOrderLine( 1);
		order3.addOrderLine(9);
		order3.addOrderLine(56);
		
		Order order4 = new Order(8, 4);
		order4.addOrderLine(82);
		
		List<Order> orders = Arrays.asList(order1, order2, order3, order4);
		
		System.out.println(orders);

//		new OrderLine(1,null);  //compiler error

	}

}