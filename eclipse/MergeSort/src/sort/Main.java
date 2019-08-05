package sort;

public class Main {

	public static void main(String[] args) {
		String[] quickInput = {"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};
		Quick.sort(quickInput);
		for(String item : quickInput) {
			System.out.print(item + " ");				
		}
	}

}
