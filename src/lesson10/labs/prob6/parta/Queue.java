package lesson10.labs.prob6.parta;

import java.util.concurrent.TimeUnit;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue{
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	private int count;
	public void add(Object newValue) {
		Node n = new Node();
		if(head == null) {
			count ++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            head = n;
        }
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	// Show the methods are not threadsafe.
	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i < 3; i++) {
			new Thread(() -> {
				queue.add("abs");
				System.out.println(queue.count);
			}).start();
		}
		// the ouput must be 1, if Queue is threadsafe;
		// but the real output is not 1, and the possibilities may be 1,2,3, so the Queue is not threadsafe.
	}
}
