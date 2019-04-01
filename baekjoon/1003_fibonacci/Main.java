import java.util.Scanner;

public class Main {
	static int[][] resultArray = new int[41][2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		try {
			int count = Integer.parseInt(scn.nextLine());
			resultArray[0][0] = 1;
			resultArray[1][1] = 1;
			for (int i = 0; i < count; i++) {
				int index = Integer.parseInt(scn.nextLine());
				int[] result = fibonacciCached(index);
				System.out.println(result[0] + " " + result[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
	
	public static int[] fibonacciCached(int n) {
		if (resultArray[n][0] != 0 || resultArray[n][1] != 0) return resultArray[n];
		int[] a = fibonacciCached(n - 1);
		int[] b = fibonacciCached(n - 2);
		resultArray[n][0] = a[0] + b[0]; 
		resultArray[n][1] = a[1] + b[1]; 
		return resultArray[n];
	}
}
