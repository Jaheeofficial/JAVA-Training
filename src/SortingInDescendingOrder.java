
public class SortingInDescendingOrder {
	public void arrayListSorting() {
		int a[] = { 1, 8, 4, 9 };
		int len = a.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		for (int k = 0; k < len; k++) {
			System.out.print(a[k] + " ");
		}
	}

	public static void main(String[] args) {
		SortingInDescendingOrder obj = new SortingInDescendingOrder();
		obj.arrayListSorting();

	}

}
