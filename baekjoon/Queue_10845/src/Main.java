import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO implement code for queue
		Scanner scn = new Scanner(System.in);
		try {
			int commandCount = Integer.parseInt(scn.nextLine());
			Queue queue = new Queue();
			for (int i = 0; i < commandCount; i++) {
				String input = scn.nextLine();
				String[] command = input.split(" ");
				switch (command[0]) {
				case "push":
					int pushValue = Integer.parseInt(command[1]);
					queue.push(new Node(pushValue));
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					System.out.println(queue.empty());
					break;
				case "front":
					int topValue = queue.front();
					System.out.println(topValue);
					break;
				case "back":
					int backValue = queue.back();
					System.out.println(backValue);
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			scn.close();
		}
	}
}
