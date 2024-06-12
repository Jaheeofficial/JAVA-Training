
//public class ReverseAString {

//public static void main(String[] args) {
//String name = " Jaheera";
//String reverse = "";
//int len = name.length();
//for (int i = len - 1; i >= 0; i--) {
//reverse = reverse + name.charAt(i);
//}
//System.out.println(reverse);
//}
//}
public class ReverseAString {
	public static void main(String[] args) {
		String original = "Jaheera";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("Reversed: " + reversed);
	}
}