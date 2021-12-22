import java.io.*;
import java.util.*;
public class Prac5{
	public void getInput()
	{
		Scanner Yash = new Scanner(System.in);
		System.out.println("\n-----| EMPLOYEE MANAGEMENT SYSTEM |-----");
		System.out.println("\nEnter Employee name: ");
		String s = Yash.next();
		System.out.println("\nEnter Employee age: ");
		int i = Yash.nextInt();
		System.out.println("\nEnter Employee Salary: ");
		float f = Yash.nextFloat();
		
		System.out.println("\n-----| OUTPUT |-----");
		System.out.println("Employee name: "+s);
		System.out.println("Age: "+i);
		System.out.println("Salary: "+f);
	}
	public static void main(String[] args) 
	{
		Prac5 obj=new Prac5();
		obj.getInput();
	}
}