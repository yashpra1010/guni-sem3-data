import java.util.*;

class Stream
{
	String stream;
	String stream()
	{
		System.out.println("Enter Your Stream: ");
		Scanner sc=new Scanner(System.in);
		stream=sc.next();
		return stream;
	}
}

class DBMS extends Stream
{
	double dbmsm;
	double DBMS()
	{
		System.out.println("Enter marks of DBMS: ");
		Scanner sc=new Scanner(System.in);
		dbmsm=sc.nextDouble();
		return dbmsm;
	}
}

class OOP extends Stream
{
	double oopm;
	double OOP()
	{
		System.out.println("Enter marks of OOP: ");
		Scanner sc=new Scanner(System.in);
		oopm=sc.nextDouble();
		return oopm;
	}
}

class Average
{
	double average;
	void display(double a,double b,String c)
	{
		average=(a+b)/2;
		System.out.println("Your Stream is: "+c);
		System.out.println("Average Marks: "+average);
	}
}

public class inheritance
{
	public static void main(String[] args) 
	{
		double x1,x2;
		String x3;
		DBMS obj=new DBMS();
		x3=obj.stream();
		x1=obj.DBMS();
		OOP obj1=new OOP();
		x2=obj1.OOP();
		Average obj2=new Average();
		obj2.display(x1,x2,x3);
	}
}