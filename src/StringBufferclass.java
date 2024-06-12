
public class StringBufferclass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hey you");
		System.out.println(sb);
		sb.insert(4, "You");
		System.out.println(sb);
		sb.replace(0, 2, "What");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);

	}

}
