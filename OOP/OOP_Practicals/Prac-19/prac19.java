import java.io.*;

public class prac19 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-19\\myFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("JAVA File Line 1\n");
		bw.write("JAVA File Line 2\n");
		bw.write("From Loop0\n");
		bw.write("From Loop1\n");
		bw.write("From Loop2\n");
		bw.write("From Loop3\n");
		bw.write("From Loop4\n");
		bw.close();
		fw.close();
		FileReader fr = new FileReader(
				"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-19\\myFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s, w = "";

		while ((s = br.readLine()) != null) {
			if (s.equals("From Loop3")) {
				w = w + "deleted" + "\n";

			} else {
				w = w + s + "\n";
			}
		}
		System.out.print(w);
		br.close();
		fr.close();
		FileWriter fw1 = new FileWriter("C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-19\\myFile.txt");
		BufferedWriter bw1 = new BufferedWriter(fw1);
		bw1.write(w);
		bw1.close();
		fw1.close();
	}
}