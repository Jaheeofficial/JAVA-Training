
public class StringsExample {

	public static void main(String[] args) {
		String a = "Hi";
		String b = " Its me";
		System.out.println(a.equals(b));
		System.out.println(a.concat(b));
		System.out.println(a.substring(1));
		System.out.println(a.contains("H"));
		System.out.println(a.endsWith("i"));
		System.out.println(a.replace("Hi","Bye"));
		System.out.println(a.replaceAll ("Hi","Hello"));
		System.out.println(b.join("&","Its","me"));
	}

}
