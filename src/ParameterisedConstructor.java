
public class ParameterisedConstructor {
	ParameterisedConstructor(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ParameterisedConstructor pc = new ParameterisedConstructor(3, 3);

	}

}
