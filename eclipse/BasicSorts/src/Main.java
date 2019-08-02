import java.util.ArrayList;
import java.util.Scanner;
import sort.*;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println("hello cmd java");
//		String[] a = readAllStrings();
		String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//		Selection.sort(a);
//		assert Selection.isSorted(a);
//		Selection.show(a);
		Insertion.sort(a);
		assert Insertion.isSorted(a);
		Insertion.show(a);
	}
	
	private static String[] readAllStrings() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>();
		while(scan.hasNext()) {
			result.add(scan.next());
		}
		return result.toArray(new String[result.size()]);
	}

}
