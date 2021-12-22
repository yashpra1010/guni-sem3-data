import java.util.*;
class A
{
	String name;
	int id;
	public void getdata()
	{
		System.out.println("Enter College Name:");
		Scanner yash=new Scanner(System.in);
		name=yash.next();
		System.out.println("Enter College id:");
		id=yash.nextInt();
	}
	void display()
	{
		System.out.println("*****College Details*****");
		System.out.println("College name:"+name);
		System.out.println("College id:"+id);
	}
}
public class prac10 extends A
{
	public static void main(String[] args)
	{
		prac10 obj=new prac10();
		obj.getdata();
		obj.display();
	}
}