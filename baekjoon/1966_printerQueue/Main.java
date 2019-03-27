import java.util.Scanner;

public class Main {
	static Queue queue;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int commandCount = Integer.parseInt(scn.nextLine());
			for (int i = 0; i < commandCount; i++) {
				int result = 1;
				String input = scn.nextLine();
				String[] command = input.split(" ");
				int targetIndex = Integer.parseInt(command[1]);
				initQueue(targetIndex);
				arrangeQueue(result);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}

	}
	
	public static void initQueue(int targetIndex) {
		try {
			String input = scn.nextLine();
			String[] items = input.split(" ");
			queue = null;
			queue = new Queue();
			for(int i=0; i< items.length; i++) {
				int priority = Integer.parseInt(items[i]);
				boolean isTarget = i == targetIndex;
				Node node = new Node(priority, isTarget);
				queue.push(node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void arrangeQueue(int resultIndex) {
		Node node = queue.front();
		if (node == null) {
			return;
		}
		int priority = node.getValue();
		int maxPriority = getMaxPriority(node.getNextNode());
		if (priority < maxPriority) {
			rearrangeQueue();
			arrangeQueue(resultIndex);
		} else {
			Node result = queue.pop();
			if (result.isTarget()) {
				System.out.println(resultIndex);
			}
			result = null;
			resultIndex++;
			arrangeQueue(resultIndex);
		}
	}
	
	public static Node getIndexNode(int index) {
		Node node = queue.front();
		for (int i = 0; i < index; i++) {
			node = node.getNextNode();
		}
		return node;
	}
	
	public static int getMaxPriority (Node node) {
		if (node == null) return -1;
		int maxPriority = node.getValue();
		while(node.getNextNode() != null) {
			node = node.getNextNode();
			int priority = node.getValue();
			if (maxPriority < priority) {
				maxPriority = priority;
			}
		}
		return maxPriority;
	}
	
	public static void rearrangeQueue() {
		Node firstNode = queue.pop();
		queue.push(firstNode);
	}
	
//	public static void printQueue() {
//		Node node = queue.front();
//		while(node != null) {
//			System.out.print(node.getValue() + " ");
//			node = node.getNextNode();
//		}
//		System.out.println();
//	}

}
