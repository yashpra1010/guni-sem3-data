import java.io.*;

public class prac20 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-20\\myFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String temp;
		int letter = 0, digit = 0, space = 0, line = 0, other = 0, word = 0;
		while ((temp = br.readLine()) != null) {
			String[] words = temp.split("\\s");
			word += words.length;
			line++;
			for (int i = 0; i < temp.length(); i++) {
				if (Character.isLetter(temp.charAt(i))) {
					letter++;
				} else if (Character.isDigit(temp.charAt(i))) {
					digit++;
				} else if (Character.isWhitespace(temp.charAt(i))) {
					space++;
				} else {
					other++;
				}
			}
		}
		fr.close();

		System.out.println("No. of characters = " + letter);
		System.out.println("No. of digit = " + digit);
		System.out.println("No. of space = " + space);
		System.out.println("No. of words = " + word);
		System.out.println("No. of lines = " + line);
		System.out.println("No. of other characters = " + other);
	}
}