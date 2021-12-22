import java.io.*;

public class file_read{
	public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("file1.txt");

	int i;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
	}
	fr.close();
	}
}