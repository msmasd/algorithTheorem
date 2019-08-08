import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static boolean[][] areFriend;
	public static int friendCount;

	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("src/input.txt"));

		int cases = sc.nextInt();
		int pairN;
		boolean[] taken;
		while (cases-- > 0) {
			friendCount = sc.nextInt();
			pairN = sc.nextInt();
			taken = new boolean[friendCount];

			areFriend = new boolean[10][10];
			for(int i=0; i < pairN; i++) {
				areFriend[sc.nextInt()][sc.nextInt()] = true;
			}

			System.out.println(countPairings(taken));
		}
		return;
	}

	public static int countPairings(boolean[] taken) {
		int firstFree = -1;
		for(int i=0; i<friendCount; i++) {
			if (!taken[i]) {
				firstFree = i;
				break;
			}
		}

		if (firstFree == -1) return 1;

		int ret = 0;
		for(int pairWith = firstFree + 1; pairWith < friendCount; pairWith++) {
			if (!taken[pairWith] && areFriend[firstFree][pairWith]) {
				taken[firstFree] = true;
				taken[pairWith] = true;
				ret += countPairings(taken);
				taken[firstFree] = false;
				taken[pairWith] = false;
			}
		}
		return ret;
	}

}
