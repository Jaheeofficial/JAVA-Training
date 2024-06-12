
public class SingleChildClassB extends SingleParentClassA{
	public void read() {
		System.out.println("Reading the data in child class");
	}

	public static void main(String[] args) {
		
		SingleChildClassB obj = new SingleChildClassB();
		obj.display();
		obj.read();

	}

}
