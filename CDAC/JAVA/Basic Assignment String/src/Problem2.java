
public class Problem2 {

	public static void main(String[] args) {
		System.out.println("Enter the String 1 : ");
		String str1 = ConsoleInput.getString();
		System.out.println("Enter the String 2 : ");
		String str2 = ConsoleInput.getString();

		if ((str1.length() == str2.length()) && str1.equals(str2)) {
			System.out.println("The strings are lexographically equal !!");
		} else if (str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {
				char a = str1.charAt(i);
				char b = str2.charAt(i);

				if (a == b) {
					continue;
				} else if (a > b) {
					System.out.println(str2 + " less than " + str1);
					break;
				} else {
					System.out.println(str1 + " less than " + str2);
					break;
				}
			}
		}else {
			if(str1.length() > str2.length()) {
				System.out.println(str2 + " less than " + str1);
			}else {
				System.out.println(str1 + " less than " + str2);
			}
		}

	}

}
