import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
//			String[] input = scn.nextLine().split(" ");
//			int n = Integer.parseInt(input[0]);
//			int k = Integer.parseInt(input[1]);
			int n = scn.nextInt();
			int k = scn.nextInt();
			int largeDiff = (n - k) > k ? (n - k) : k;
			int result = binomialCoefficient(n, largeDiff) / binomialCoefficient(n - largeDiff, 1);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
	
	public static int binomialCoefficient(int n, int k) {
		if (n == k || n == 0) return 1;
		return n * binomialCoefficient(n - 1, k);
	}

}
