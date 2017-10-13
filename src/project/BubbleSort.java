package project;

public class BubbleSort {
	public static void bubbleSort(String[] a, int n) {
		for (int i = n - 1; i >= 1; i--)
			for (int j = 0; j < i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					String tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
	}
}
