import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
			int n = scn.nextInt();
			int result = factorial(n);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
	public static int factorial(int n) {
		if (n <= 1) return 1;
		return n * factorial(n -1);
	}
}
