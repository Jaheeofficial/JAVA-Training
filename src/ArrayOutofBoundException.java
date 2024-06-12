
public class ArrayOutofBoundException {
	public void arrayoutbound() {
		int a[] = new int[5];
		String str = null;
		try {
			a[1]= 89;
			a[0]= 89;
			a[10]= 89;
			str.length();
			a[2]= 89;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception occurred");
		}
		
		System.out.println("Jaheera");
		System.out.println("Jaheera1");
		System.out.println("Jaheera2");
		System.out.println("Jaheera3");
		System.out.println("Jaheera4");
	}

	public static void main(String[] args) {
		
		ArrayOutofBoundException obj = new ArrayOutofBoundException();
		obj.arrayoutbound();

	}

}
