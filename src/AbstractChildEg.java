
public class AbstractChildEg extends AbstractEg {
	public void write() {
		System.out.println("Writing non abstract");
	}

	public static void main(String[] args) {
		AbstractEg obj = new AbstractChildEg();

		System.out.println(obj.empage);
		System.out.println(obj.name);
		System.out.println(empid);
		obj.read();
		obj.write();
	}

}
