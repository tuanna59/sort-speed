package project;

public class QuickSort {
	public static int partition(String a[], int left, int right) {
		String x = a[left];
		int i = left + 1;
		int j = right;
		do {
			while ((i <= j) && (a[i].compareTo(x) <= 0))
				i++;
			while ((i <= j) && (a[j].compareTo(x) > 0))
				j--;
			if (i < j) {
				String tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		} while (i <= j);
		String tmp = a[left];
		a[left] = a[j];
		a[j] = tmp;
		return j;
	}

	public static void quickSort(String[] a, int left, int right) {
		int k;
		if (left < right) {
			k = partition(a, left, right);
			quickSort(a, left, k - 1);
			quickSort(a, k + 1, right);
		}
	}
}
