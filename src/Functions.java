
public class Functions {
	public void dividedby2(double numerator, double denomenator ) {
	
		System.out.println(numerator/denomenator);
	}
	
	public void print(String input) {
		System.out.println(input);
		
	}

	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.dividedby2(50,25);
		obj.print("Hello world");
		obj.dividedby2(25,5);
	}

}
	