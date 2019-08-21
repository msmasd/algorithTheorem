import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	static final int switchCount = 10;
	static final int INF = 9999;
	static int[] clocks = new int[16];
	static int[][] switchWorks = {
			{0, 1, 2},
			{3, 7, 9, 11},
			{4, 10, 14, 15},
			{0, 4, 5, 6, 7},
			{6, 7, 8, 10, 12},
			{0, 2, 14, 15},
			{3, 14, 15},
			{4, 5, 7, 14, 15},
			{1, 2, 3, 4, 5},
			{3, 4, 5, 9, 13}
	};

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("src/input.txt"));
		int cases = sc.nextInt();
		while(cases-- > 0) {
			initClocks(sc);
			int result = solve(0);
			System.out.println(result);
		}
	}
	
	public static void initClocks(Scanner sc) {
		for(int i=0; i<16; i++) {
			clocks[i] = sc.nextInt();
		}
	}
	
	public static int pushSwitch(int clock) {
		int result = clock + 3;
		return result > 12 ? 3 : result;
	}
	
	public static void ClickSwitch(int switchIndex) {
		int[] targetSwitch = switchWorks[switchIndex];
		for(int i=0; i<targetSwitch.length; i++) {
			int clockIndex = targetSwitch[i];
			clocks[clockIndex] = pushSwitch(clocks[clockIndex]); 
		}
	}
	
	public static boolean areAligned() {
		for(int i=0; i<16; i++) {
			if (clocks[i] != 12) return false;
		}
		return true;
	}
	
	public static int solve(int switchIndex) {
		if (switchIndex == switchCount) {
			return areAligned() ? 0 : INF;
		}
		int ret = INF;
		for (int cnt=0; cnt<4; cnt++) {
			ret = Math.min(ret, cnt + solve(switchIndex + 1));
			ClickSwitch(switchIndex);
		}
		return ret;
	}

}
