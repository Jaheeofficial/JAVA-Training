
public class Evenodd {
	public void printEvenOrOdd(int a) {

		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		Evenodd obj = new Evenodd();
		obj.printEvenOrOdd(2);
	}

}
