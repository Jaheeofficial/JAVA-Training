
public class ExceptionHandling {
	public void arthexcep() {
		try {
			int data = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Iam the mandatory code");
		}
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.arthexcep();
		

	}

}
