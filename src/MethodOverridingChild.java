
public class MethodOverridingChild extends MethodOverridingParent{
	
		public void colour() {
			String colour = "pink";
			System.out.println(colour);
		}

	

	public static void main(String[] args) {
		MethodOverridingChild obj = new MethodOverridingChild();
		
		
		obj.colour();
		
	}

}
