package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.CustOrderFactory;
import lesson5.labs.prob4.Customer;
import lesson5.labs.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.createItem("Shirt"));
		order.addItem(CustOrderFactory.createItem("Laptop"));

		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.createItem("Pants"));
		order.addItem(CustOrderFactory.createItem("Knife set"));

		System.out.println(cust.getOrders());
	}
}

		
