
public class Problem4 {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String str = ConsoleInput.getString();
		str = str.toLowerCase();
		char start = 'a';
		for (int i = 0; i < 26; i++) {
			int num = str.indexOf(start);
			if (num != -1) {
				System.out.println(start + " : " + num);
			}
			start++;
		}
	}

}
