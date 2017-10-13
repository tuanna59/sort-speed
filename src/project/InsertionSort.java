package project;

public class InsertionSort {
	public static void insertionSort(String[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			String tmp = a[i];
			while (j >= 0 && a[j].compareTo(tmp) > 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = tmp;
		}
	}
}
