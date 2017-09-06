package lesson2.labs.prob2.prob2B;

import java.util.List;
import java.util.ArrayList;

public class Order {
	private int orderNum;
	private List<OrderLine> orderLines;
	public Order(int orderNum, int lineNum) {
		this.orderNum = orderNum;
		orderLines = new ArrayList<>();
		addOrderLine(lineNum);
	}
	public void addOrderLine(int lineNum){
		orderLines.add(new OrderLine(lineNum, this));
	}

	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public String toString() {
		String msg = "Order: \n";
		for(OrderLine o : orderLines) {
			msg += o.toString() + "\n";

		}
		return msg;
	}
}
