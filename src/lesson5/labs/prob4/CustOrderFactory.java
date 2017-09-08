package lesson5.labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory{
    public static Customer createCustomer(String name) {
        if(name == null) {
            throw new NullPointerException("Customer name cannot be null");
        }

        return new Customer(name);
    }

    public static Order createOrder(Customer cust, LocalDate orderDate) {
        if(cust == null){
            throw new NullPointerException("customer cannot be null");
        }

        Order ord = new Order(orderDate);
        cust.addOrder(ord);

        return ord;

    }
    public static void addOrder(Customer cust, Order order) {
        if(cust == null) {
            throw new NullPointerException("customer cannot be null");
        }

        cust.addOrder(order);
    }

    public static Item createItem(String name) {
        if(name == null || name.trim().equals("")){
            throw new NullPointerException("name cannot be empty");
        }

        return new Item(name);
    }

    public static void addItem(Order order, Item item) {
        if(order == null) {
            throw new NullPointerException("Null order");
        }

        order.addItem(item);
    }
}
