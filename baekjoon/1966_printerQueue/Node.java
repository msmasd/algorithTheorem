public class Node {
	private int value;
	private boolean isTarget;
	private Node nextNode;
	
	public Node(int value, boolean isTarget) {
		this.value = value;
		this.isTarget = isTarget;
		this.nextNode = null;
	}	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public boolean isTarget() {
		return isTarget;
	}
}
