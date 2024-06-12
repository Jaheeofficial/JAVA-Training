
public class ParameterizedFunction {
	public void algoritham(int a, int b) {
		int c= a + b;
		System.out.println(c);
		int d= a * b;
		System.out.println(d);
		int e= a - b;
		System.out.println(e);
		int f= a / b;
		System.out.println(f);
	}

	public static void main(String[] args) {
		ParameterizedFunction obj = new ParameterizedFunction();
		obj.algoritham(3, 4);
		

	}

}
