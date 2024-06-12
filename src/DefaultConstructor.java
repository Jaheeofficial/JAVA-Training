
public class DefaultConstructor {
	//default constructor
	public void testcase1() {
	System.out.println("Testcase1");
	}
	DefaultConstructor(){
		System.out.println("Iam the default constructor");
	}
	public void testcase2() {
		System.out.println("Testcase2");
		}
	public static void main(String[] args) {
		
		DefaultConstructor dc = new DefaultConstructor();
		dc.testcase1();
		dc.testcase2();

	}

}
