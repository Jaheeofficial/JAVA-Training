
public class MultipleInterfaceChildClass implements InterfaceName,InterfaceAge {
	public void name() {
		String name = "Jaheera";
		System.out.println(name);
	}
	public void age() {
		int age = 25;
		
		System.out.println(age);	
	}

	public static void main(String[] args) {
		//MultipleInterfaceChildClass obj = new MultipleInterfaceChildClass();
		InterfaceName iref = new MultipleInterfaceChildClass();
		//InterfaceAge iref1= new MultipleInterfaceChildClass();
		
		iref.name();
		//iref1.age();
		

	}

}
