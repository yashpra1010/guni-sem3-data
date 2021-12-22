public class bufferreader {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("E:\\ICT\\java\\file1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
		fr.close();
	}
}