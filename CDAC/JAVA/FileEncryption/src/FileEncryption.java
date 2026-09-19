import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {

	public static void main(String[] args) {

		File input = new File("input.txt");
		File encrypted = new File("encrypted.txt");
		File decrypted = new File("decrypted.txt");

		createFile(encrypted, decrypted);

		fileOperations(input, encrypted, true);

		fileOperations(encrypted, decrypted, false);

		printFile(decrypted);

	}

	public static void createFile(File encrypted, File decrypted) {
		try {
			if (!encrypted.exists()) {
				encrypted.createNewFile();
			}

			if (!decrypted.exists()) {
				decrypted.createNewFile();
			}

		} catch (FileNotFoundException fe) {
			System.out.println("File Not Found " + fe.getMessage());
		} catch (IOException e) {
			System.out.println("IO exception " + e.getMessage());
		}
	}

	public static void fileOperations(File sourceFile, File destinationFile, boolean isEncryption) {
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
				FileWriter fw = new FileWriter(destinationFile, true)) {
			String str;
			while ((str = br.readLine()) != null) {

				char[] arr = str.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					if (isEncryption) {
						arr[i] = (char) (arr[i] + 5);
					} else {
						arr[i] = (char) (arr[i] - 5);
					}
				}

				String result = new String(arr);

				try {
					fw.write(result);
				} catch (FileNotFoundException fe) {
					throw fe;
				} catch (IOException e) {
					throw e;
				}

			}
		} catch (FileNotFoundException fe) {
			System.out.println("File Not Found " + fe.getMessage());
		} catch (IOException e) {
			System.out.println("IO exception " + e.getMessage());
		}
	}

	public static void printFile(File decrypted) {
		try (BufferedReader br = new BufferedReader(new FileReader(decrypted))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException fe) {
			System.out.println("File Not Found " + fe.getMessage());
		} catch (IOException e) {
			System.out.println("IO exception " + e.getMessage());
		}
	}

}
