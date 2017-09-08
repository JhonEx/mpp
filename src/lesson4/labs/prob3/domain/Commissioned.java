package lesson4.labs.prob3.domain;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{

	private int baseSalary;
	private double commission;
	private List<Order> orderList;
	
	public Commissioned(){
		this.baseSalary = 100; 
		this.commission = 0.1;
		orderList = new ArrayList<Order>();
	}
	
	public void addOrder(Order order){
		orderList.add(order);
	}
	
	@Override
	double calcGrossPay(int month, int year) {
		int orderTotal = 0;
		for(Order order : orderList){
			String orderDate = order.getOrderDate();
			String yearS = orderDate.split("-")[0];
			String monthS = orderDate.split("-")[1];
			
			if(Integer.valueOf(yearS) == year && 
					Integer.valueOf(monthS) == month){
				orderTotal += order.getOrderAmount();
			}
		}
		
		return baseSalary + commission * orderTotal;
	}

	public void print(){
		System.out.println("commissioned");
	}
}
