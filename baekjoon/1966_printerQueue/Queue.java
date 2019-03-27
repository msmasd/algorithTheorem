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
		newNode.setNextNode(null);
		lastNode = newNode;
		size++;
	}
	
	// stack pop
	public Node pop() {
		if (firstNode == null) return null;
		Node item = firstNode;
		firstNode = item.getNextNode();
		size--;
		if (size == 0) {
			lastNode = null;
		}
		return item;
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		boolean isEmpty = size == 0;
		if (isEmpty) return 1;
		return 0;
	}
	
	public Node front() {
		if(firstNode == null) return null;
		Node item = firstNode;
		return item;
	}
	
//	public Node back() {
//		if(lastNode == null) return null;
//		Node item = lastNode;
//		return item;
//	}
}