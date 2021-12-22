import java.io.*;

public class Prac3
{
	public int PenCost()
	{
		return 144;
	}
	public int BookCost()
	{
		return 120;
	}
	public static void main(String[] args) {
		Prac3 obj=new Prac3();
		System.out.println("********| Stationary Invoice |********");
		System.out.println("\nBook Cost: "+obj.BookCost());
		System.out.println("Pen Cost: "+obj.PenCost());
	}
}