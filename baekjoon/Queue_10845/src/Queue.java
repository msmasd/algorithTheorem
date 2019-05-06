
public class Queue {
	private Node lastNode;
	private Node firstNode;
	private int size;
	
	// 생성자
	public Queue() {
		this.lastNode = null;
		this.firstNode = null;
		this.size = 0;
	}
	
	// stack 추가
	public void push(Node newNode) {
		if (lastNode != null) {
			lastNode.setNextNode(newNode);
		}
		if (size == 0) {
			firstNode = newNode;
		}
		lastNode = newNode;
		size++;
	}
	
	// stack pop
	public int pop() {
		if (firstNode == null) return -1;
		Node item = firstNode;
		int value = item.getValue();
		firstNode = item.getNextNode();
		size--;
		if (size == 0) {
			lastNode = null;
		}
		item = null;
		return value;
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		boolean isEmpty = size == 0;
		if (isEmpty) return 1;
		return 0;
	}
	
	public int front() {
		if(firstNode == null) return -1;
		Node item = firstNode;
		return item.getValue();
	}
	
	public int back() {
		if(lastNode == null) return -1;
		Node item = lastNode;
		return item.getValue();
	}
}
