package lesson2.labs.prob2.prob2B;

public class OrderLine {
	private Order order;
	private int lineNum;

	OrderLine(int lineNum, Order order){
		this.lineNum = lineNum;
		this.order = order;
	}

	public String toString(){
		return "  line item: \n"  + "    line num = " + lineNum;
	}

}
