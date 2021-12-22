
import java.io.*;

/*
@author Yash Prajapati
*/
public class prac21 {
	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-21\\odd.txt");
		FileWriter f2 = new FileWriter(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-21\\even.txt");
		FileReader fs = new FileReader(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-21\\Number.txt");
		BufferedReader br = new BufferedReader(fs);
		String temp = "";
		while ((temp = br.readLine()) != null) {
			String[] words = temp.split("\\s");
			for (String w : words) {
				if (Integer.parseInt(w) % 2 == 0) {
					f2.write(w + " ");
					System.out.println("Even No : " + w + " ");
				} else {
					f1.write(w + " ");
					System.out.println("Odd No : " + w + " ");
				}
			}
		}
		br.close();
		f1.close();
		f2.close();
	}
}