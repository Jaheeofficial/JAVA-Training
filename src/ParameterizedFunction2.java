
public class ParameterizedFunction2 {
	public void evenorodd(int a,int b) {
		int c = a*b;
		System.out.println(c);
		int d = a+b;
		System.out.println(d);
		if(c % 2 == 0) {
			System.out.println("Even");
		}
			else {
				System.out.println("odd");
			}
			
		}
		
	

	public static void main(String[] args) {
		ParameterizedFunction2 obj = new ParameterizedFunction2();
		obj.evenorodd(2,3);	

	}

}
