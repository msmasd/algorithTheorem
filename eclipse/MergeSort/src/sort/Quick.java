package sort;

public class Quick extends SortCommon {
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	// a[]를  a[lo..j-1], a[j], a[j+1..hi]으로 분할하고 j를 리턴
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;

		Comparable v = a[lo]; // 분할 기준 항목
		while(true) {
			while(less(a[++i], v)) {
				if (i == hi) break;
			}
			while(less(v, a[--j])) {
				if (j == lo) break;
			}
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
}
