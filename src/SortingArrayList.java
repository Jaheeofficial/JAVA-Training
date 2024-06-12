
public class SortingArrayList {
	public void arrayListInAscending() {

		int a[] = { 8, 9, 1 };
		int len = a.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					// Swapping
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
		SortingArrayList obj = new SortingArrayList();
		obj.arrayListInAscending();
	}

}
