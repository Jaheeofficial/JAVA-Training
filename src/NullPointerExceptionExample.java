
public class NullPointerExceptionExample {
	public void nullException() {
		String name = null;
		try {
			name.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		NullPointerExceptionExample obj = new NullPointerExceptionExample();
		obj.nullException();

	}

}
