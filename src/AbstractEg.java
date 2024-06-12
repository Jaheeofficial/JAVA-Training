
abstract class AbstractEg {
	// Abstract classes by default are public in nature.
	// Abstract classes cannot be instantiated that means cannot create object of
	// the class
	String name = "Jaheera";
	static int empid = 78898;
	final int empage = 25;

	// Abstract method allow only Method signature not method body
	abstract void write();

	// Non abstract method allows both method signature and method body
	// eg: public void read()is method signature and {System.out.println("Reading in
	// abstract class");}is method body.
	public void read() {
		System.out.println("Reading in abstract class");
	}

}
