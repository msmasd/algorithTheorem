import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			for(int j=0; j<3; j++) {
				String input = scan.nextLine();
				int zeros = 0;
				String[] inputs = input.split(" ");
				for(int i=0; i<inputs.length; i++) {
					if (inputs[i].equals("0")) {
						zeros++;
					}
				}
				String result = new String();
				switch(zeros) {
				case 0:
					result = "E";
					break;
				case 1:
					result = "A";
					break;
				case 2:
					result = "B";
					break;
				case 3:
					result = "C";
					break;
				case 4:
					result = "D";
					break;
				}
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

}
