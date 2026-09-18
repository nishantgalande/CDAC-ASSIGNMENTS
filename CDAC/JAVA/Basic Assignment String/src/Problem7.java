
public class Problem7 {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String str = ConsoleInput.getString();
		StringBuffer stbr = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			stbr.append(str.charAt(i));
		}
		System.out.println(stbr);
	}
}
