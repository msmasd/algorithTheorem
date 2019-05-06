
public class Stack {
	private Node topNode;
	private int size;
	
	// 생성자
	public Stack() {
		this.topNode= null;
		this.size = 0;
	}
	
	// stack 추가
	public void push(Node newNode) {
		newNode.setNextNode(topNode);
		topNode = newNode;
		size++;
	}
	
	// stack pop
	public int pop() {
		if (topNode == null) return -1;
		Node item = topNode;
		int value = item.getValue();
		topNode = item.getNextNode();
		size--;
		item = null;
		return value;
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		boolean isEmpty = topNode == null;
		if (isEmpty) return 1;
		return 0;
	}
	
	public int top() {
		if(topNode == null) return -1;
		Node item = topNode;
		return item.getValue();
	}
}
