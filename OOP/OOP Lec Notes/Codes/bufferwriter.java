public class bufferwriter {
	public static void main(String[] args) {

		FileWriter fw = new FileWriter("E:\\ICT\\java\\file5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Good Morning");
		bw.write("Welcome");
		bw.close();
	}

}