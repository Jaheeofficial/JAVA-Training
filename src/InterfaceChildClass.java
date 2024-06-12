
public class InterfaceChildClass implements Interface1{
public void run() {
	System.out.println("Running in child class of the interface");
	
}
	public static void main(String[] args) {
		Interface1 Iref= new InterfaceChildClass();
		Iref.run();
		System.out.println(S1);
		System.out.println(age);
		

	}

}
