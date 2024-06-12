
public class Student {
	
	String name = "Jaheera";
	
	String department = "Sam";
	
	int marks = 100;
	
	public void printname() {
		System.out.println("k");
		
	}
	
	public static void main(String[] args) {
		Student details = new Student();
		System.out.println(details.name + " " + details.department + " " + details.marks);
		details.printname();
		details.printname();
	}
}
