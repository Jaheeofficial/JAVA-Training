
public class MethodOverloading {
	public void string(String a, String b) {
		String c = a + b;
		System.out.println(c);
	}

	public void string(String a, String b, int e) {
		String d = a + b + e;
		System.out.println(d);
	}
	// Method overloading

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.string("Hello", " Hi");
		obj.string("Its", " Me", 8);

	}

}
