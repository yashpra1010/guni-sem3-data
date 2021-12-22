	import java.io.*;
	import java.util.*;

	public class p18 {
		public static void main(String[] args) {
			try {
				File f = new File(
						"C:\\Users\\admin\\Google Drive\\B-Tech\\guni-sem3-data\\SEM-3\\OOP\\OOP_Practicals\\Prac-18\\p18_ques1.txt");
				if (f.exists()) {
					System.out.print("Mentioned File Exists.\n");
					System.out.print("It's absolute paths is:" + f.getAbsolutePath() + "\n");
				} else {
					System.out.print("File Does Not Exists so creating new file...\n");
					if (f.createNewFile()) {
						System.out.print("File successfully created !!!\n");
					}
				}
				try (FileWriter fw = new FileWriter(f)) {
					ArrayList<String> al = new ArrayList<>();
					al.add("Yash Prajapati");
					al.add("Nitin Prajapati");
					al.add("Purav Shah");
					al.add("Jinay Shah");
					al.add("Ujjval Patel");
					for (String a : al) {
						if (a.equals("Yash Prajapati")) {
							System.out.print("Initial Letter of your name is:" + a.charAt(0) + "\n");
						}
					}
					for (String s : al) {
						fw.write(s + "\n");
					}
					fw.close();
				}
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}