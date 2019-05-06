import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO implement code for stack
		Scanner scn = new Scanner(System.in);
		try {
			int commandCount = Integer.parseInt(scn.nextLine());
			Stack stack = new Stack();
			for (int i = 0; i < commandCount; i++) {
				String input = scn.nextLine();
				String[] command = input.split(" ");
				switch (command[0]) {
				case "push":
					int pushValue = Integer.parseInt(command[1]);
					stack.push(new Node(pushValue));
					break;
				case "pop":
					System.out.println(stack.pop());
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					System.out.println(stack.empty());
					break;
				case "top":
					int topValue = stack.top();
					System.out.println(topValue);
					break;
				}
			}
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			scn.close();
		}
	}
}
