package sort;

public class MergeBU extends SortCommon {

	private static Comparable[] aux;
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1; sz < N; sz += sz) {
			for(int lo = 0; lo < N-sz; lo += sz+sz) {
				merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz -1,  N - 1));
			}
		}
		sort(a, 0, a.length - 1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo, j = mid+1;
		aux = new Comparable[a.length];

		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}
}
