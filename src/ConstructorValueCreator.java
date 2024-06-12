
public class ConstructorValueCreator {
	String name;
	int id;
	public void display() {
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {
		
		ConstructorValueCreator cv = new ConstructorValueCreator ();
		cv.display();
		

	}

}
