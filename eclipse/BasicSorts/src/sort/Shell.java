package sort;

public class Shell extends SortCommon {

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40, 121, ...
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
					exch(a, j, j - h);
			}
			h = h / 3;
		}
			
	}

}
