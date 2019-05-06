import java.util.Scanner;

public class Main {
	private static long[] results;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		results = new long[1002];
		Scanner scn = new Scanner(System.in);
		try {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int max = n - k > k ? n - k : k;
			long result1 = binomialCoefficient(n, max);
			long result2 = binomialCoefficient(n - max, 1);
			long result = (result1 / result2);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
	
	public static long binomialCoefficient(int n, int k) {
		if (n <= 1) {
			return 1;
		}
		else if (n == k) {
			return k;
		}
		
		if (results[n] != 0) {
			return results[n];
		}

		results[n] = (n * binomialCoefficient(n-1, k)) % 10007;

		return results[n];
	}
	

}
