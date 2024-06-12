
public class FinalVariableeg {
	public void display() {
		final String colour = "Red";
		System.out.println(colour);
		colour = "yellow";
		
	}
	
	

	public static void main(String[] args) {
		
		FinalVariableeg obj = new FinalVariableeg ();
		obj.display();
	

	}

}
