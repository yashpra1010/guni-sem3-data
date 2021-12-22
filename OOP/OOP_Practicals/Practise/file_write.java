import java.io.*;
import java.util.*;

public class file_write {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("a.txt");
		Scanner sc=new Scanner(System.in);
		String yash;
		System.out.println("\nEnter string to insert: ");
		yash=sc.nextLine();

		fw.write("Hello\n");
		fw.write(yash);
		sc.close();
		fw.close();
	}
}