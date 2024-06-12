
public class Fruit {
	String colour = "yellow";
	String shape = "Round";
	String taste = "Sweet";
	public void printfruit() {
		System.out.println("This is Mango");
		
	}
	public static void main(String[]args) {
		Fruit properties = new Fruit();
		System.out.println("Colour is "+properties.colour);
		System.out.println("Shape is"+ " "+properties.shape);
		System.out.println("Taste is"+ " "+properties.taste);
		properties.printfruit();
		
		
	}

}
