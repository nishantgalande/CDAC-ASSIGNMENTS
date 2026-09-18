
public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		String str = ConsoleInput.getString();
		System.out.println("Enter the index to get the char: ");
		int num = ConsoleInput.getInt();
		System.out.println(str.charAt(num));
	}

}
