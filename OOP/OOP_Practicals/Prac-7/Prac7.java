import java.util.*;
public class Prac7
{
	float pie=3.14f;

	public double compute(double a)
	{
		double area=a*a;
		return area;
	}
	public double compute(double a,double b)
	{
		double area=a*b;
		return area;
	}
	public double compute(float a,double b)
	{
		double area=a*b*b;
		return area;
	}
	public static void main(String[] args)
	{
		double x,len,width,radius;
		System.out.println("Enter The Size Of A Side Of Square:");
		Scanner Yash=new Scanner(System.in);
		x=Yash.nextDouble();

		System.out.println("Enter The Length Of Rectangle:");
		len=Yash.nextDouble();

		System.out.println("Enter The Width Of Rectangle:");
		width=Yash.nextDouble();

		System.out.println("Enter Radius Of Circle:");
		radius=Yash.nextDouble();

		Prac7 obj=new Prac7();

		System.out.println("Area Of Square:"+obj.compute(x));
		System.out.println("Area Of Recangle:"+obj.compute(len,width));
		System.out.println("Area Of Circle:"+obj.compute(obj.pie,radius));
	}
}