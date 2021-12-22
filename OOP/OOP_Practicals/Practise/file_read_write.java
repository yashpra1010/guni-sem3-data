import java.io.*;

public class file_read_write {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("1.txt");
		FileWriter fw = new FileWriter("2.txt");

		int i;
		char ch;
		while ((i = fr.read()) != -1) {
			System.out.println((char) i);
			ch=(char)i;
			fw.write(ch);
		}

		fr.close();
		fw.close();
	}
}
