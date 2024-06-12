
public class EncapsulationEg {
	// private data member
	private String colour;

	// Getter method for colour
	public void getname() {
		System.out.println(colour);
	}

	public void setname(String c) {
		this.colour = c;

	}

	public static void main(String[] args) {
		EncapsulationEg obj = new EncapsulationEg();
		obj.setname("Pink");
		obj.getname();
		

	}

}
