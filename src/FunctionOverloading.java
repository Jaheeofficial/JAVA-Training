
public class FunctionOverloading {
	public void add(double d, int b) {
		double c = d + b;
				System.out.println(c);
	}
	public void add(int a,int b, int c) {
		double d = a+b+c;
				System.out.println(d);
	}
	public void add(double d,double e2,double e3,double e4) {
		double e = d+e2+e3+e4;
				System.out.println(e);
	}

	public static void main(String[] args) {
		FunctionOverloading obj = new FunctionOverloading();
		obj.add(2.0, 2);
		obj.add(38, 36, 37);
		obj.add(2.4, 3.5, 4.5, 5.5);
		


	}

}
