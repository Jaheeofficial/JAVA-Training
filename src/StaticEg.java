
public class StaticEg {
	static String name = "Jaheera";
	int age = 25;
	public void read() {
		System.out.println("Reading everything");
	}
	static public void display() {
		System.out.println("displaying everything");
	}

	public static void main(String[] args) {
		StaticEg obj = new StaticEg();
		System.out.println(obj.age);
		//System.out.println(name);or
		System.out.println(StaticEg.name);
		obj.read();
		//StaticEg.display();or
		display();

	}

}
