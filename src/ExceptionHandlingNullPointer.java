
public class ExceptionHandlingNullPointer {
	public void nullpointer() {
		try {
			String a = null;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingNullPointer obj = new ExceptionHandlingNullPointer();
		obj.nullpointer();

	}

}
