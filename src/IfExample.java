
public class IfExample {
	//Parameterized function
	public void eligibility(int age) {
		if(age >= 18) {
			System.out.println("Eligible for voting");
			}
		else {
			System.out.println("Not eligible for voting");
		}
	}

	public static void main(String[] args) {
		
		IfExample obj = new IfExample();
		obj.eligibility(24);
		obj.eligibility(17);

	}

}
