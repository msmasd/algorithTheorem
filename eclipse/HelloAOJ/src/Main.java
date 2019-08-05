import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		mercy();
	}

	public static void helloWorld() {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0) {
			String name = sc.next();
			System.out.println("Hello, " + name + "!");
		}
	}

	public static void mercy() {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0) {
			System.out.println("Hello Algospot!");
		}
	}
}
