
public class Problem3 {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String str1 = ConsoleInput.getString();
		
		System.out.println("Enter the String to check the ending: ");
		String str2 = ConsoleInput.getString();
		int length1 = str1.length();
		int length2 = str2.length();

		while(length2 > 0) {
			
			if(str1.charAt(length1-1) == str2.charAt(length2-1)) {
				
			}else {
				System.out.println(str1 +"end with " + str2 + "False");
				return;
			}
			
			length1--;
			length2--;
		}
		System.out.println(str1 +"end with " + str2 + "True");
	}

}
