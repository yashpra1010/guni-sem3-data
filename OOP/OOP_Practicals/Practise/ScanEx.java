import java.util.*;
public class ScanEx{
	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n*****Input*****");
		System.out.println("\nEnter String: ");
		String s = sc.next();
		System.out.println("\nEnter int value: ");
		int i = sc.nextInt();
		System.out.println("\nEnter float value: ");
		float f = sc.nextFloat();
		
		System.out.println("\n*****Output*****");
		System.out.println("String: "+s);
		System.out.println("Int: "+i);
		System.out.println("Float: "+f);
	}
	public static void main(String[] args) 
	{
		ScanEx obj=new ScanEx();
		obj.getInput();
	}
}