
public class StringBuilderclass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hyderabad");
		System.out.println(sb);
		sb.insert(9, ("I Love"));
		System.out.println(sb);
		sb.replace(0, 1, "I");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		

	}

}
