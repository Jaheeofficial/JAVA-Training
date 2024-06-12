
public class ArrayOutOfBound {
	public void ArrayException() {
		int a[] = { 1, 3, 5, 7, 8 };
		try {
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		ArrayOutOfBound obj = new ArrayOutOfBound();
		obj.ArrayException();

	}

}
