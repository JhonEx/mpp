package lesson4.labs.prob3.domain;

class Order {

	private int orderNo;
	private String orderDate;
	private int orderAmount;
	
	public Order(int orderNo, String orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public int getOrderAmount() {
		return orderAmount;
	}
}
