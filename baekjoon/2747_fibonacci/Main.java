import java.util.Scanner;

public class Main {
//	static int[] resultArray = new int[91];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		try {
			long index = scn.nextLong();
//			resultArray[0] = 0;
//			resultArray[1] = 1;
			long result = fibonacci(index);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
	
//	public static int fibonacciCached(int n) {
//		if (n <= 0) return 0;
//		else if (resultArray[n] != 0) return resultArray[n];
//		resultArray[n] = fibonacciCached(n - 1) + fibonacciCached(n - 2);
//		return resultArray[n];
//	}
	
	public static long fibonacci(long index) {
		long result = 0;
		long firstResult = 0;
		long secondResult = 1;
		if (index == 1) return index;
		for (long i=2; i<=index; i++) {
			result = (firstResult + secondResult) % 1000000;
			firstResult = secondResult;
			secondResult = result;
		}
		return result;
	}
}
