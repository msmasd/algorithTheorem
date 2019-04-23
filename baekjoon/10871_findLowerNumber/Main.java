import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			String input = scan.nextLine();
			String[] inputs = input.split(" ");
			int N = Integer.parseInt(inputs[0]);
			int X = Integer.parseInt(inputs[1]);
			Integer[] array = new Integer[N];
			for (int i=0; i<N; i++) {
				array[i] = scan.nextInt();
			}
			for (int i=0; i<N; i++) {
				if (array[i] < X) {
					System.out.print(array[i] + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
