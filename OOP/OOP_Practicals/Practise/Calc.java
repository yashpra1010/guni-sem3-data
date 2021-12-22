import java.io.*;

public class Calc
{
	public static void main(String[] args)
	{
		double a=3,b=4,c=2;
		double calc,area,harea,s;
		
		calc=a*((1+(b/4))+(c*5));
		area=(a*b)/2;
		s=(a+b+c)/2;
		harea=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("\nAnswer: "+calc+"\n");
		System.out.println("\nArea of Triangle: "+area+"\n");
		System.out.println("\nArea of Triangle using heron's formula: "+harea+"\n");
	}
}