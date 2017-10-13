package project;

public class SelectionSort {
	public static void selectionSort(String[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[min].compareTo(a[j]) > 0)
					min = j;
			}
			if (a[i] != a[min]) {
				String tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
	}
}
