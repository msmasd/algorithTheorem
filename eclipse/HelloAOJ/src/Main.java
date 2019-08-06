import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		while(cases-- > 0) {
			drawrect(sc);
		}
	}

	public static void helloWorld(Scanner sc) {
		String name = sc.next();
		System.out.println("Hello, " + name + "!");
	}

	public static void mercy(Scanner sc) {
		System.out.println("Hello Algospot!");
	}
	
	public static void drawrect(Scanner sc) {
		int resultX = -1;
		int resultY = -1;
		// point 값 초기화
		Point[] points = initPointFromInput(sc);
		// point순회해서 X값 찾기
		if (points[0].equalX(points[1])) {
			resultX = points[2].x;
		} else if (points[0].equalX(points[2])) {
			resultX = points[1].x;
		} else {
			resultX = points[0].x;
		}
		
		// point순회해서 Y값 찾기
		if (points[0].equalY(points[1])) {
			resultY = points[2].y;
		} else if (points[0].equalY(points[2])) {
			resultY = points[1].y;
		} else {
			resultY = points[0].y;
		}
		Point result = new Point(resultX, resultY);
		System.out.println(result);
	}
	
	public static Point[] initPointFromInput(Scanner sc) {
		Point[] points = new Point[3];
		for (int i = 0; i < 3; i++) {
			String[] inputLine = sc.nextLine().split(" ");
			int x = Integer.parseInt(inputLine[0]);
			int y = Integer.parseInt(inputLine[1]);
			points[i] = new Point(x, y);
		}
		return points;
	}
	
	static class Point {
		public int x;
		public int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Point() {
		}

		public boolean equalX(Point target) {
			return this.x == target.x;
		}
		
		public boolean equalY(Point target) {
			return this.y == target.y;
		}
		
		public String toString() {
			return new String(x + " " + y);
		}
	}
}
