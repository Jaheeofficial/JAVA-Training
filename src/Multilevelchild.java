
public class Multilevelchild extends Multilevelparent2{
	String s3 = "Selinium";
	public void display () {
		System.out.println("Displaying in child class");
	}
	

	public static void main(String[] args) {
		 Multilevelchild obj = new  Multilevelchild();
		 System.out.println(obj.s1);
		 System.out.println(obj.s2);
		 System.out.println(obj.s3);
		 obj.write();
		 obj.read();
		 obj.display();
		

	}

}
