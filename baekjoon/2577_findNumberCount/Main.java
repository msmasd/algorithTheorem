import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			long sum = i * j * k;
			String sumToString = String.valueOf(sum);
			Integer[] numberCount = new Integer[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			for (int z=0; z<sumToString.length(); z++) {
				int index = Character.getNumericValue(sumToString.charAt(z));
				numberCount[index]++;
			}
			for (int z=0; z<numberCount.length; z++) {
				System.out.println(numberCount[z]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

}
