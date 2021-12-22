import java.util.*;
import java.time.*;

public class p17
{
	Scanner yash=new Scanner(System.in);
	String name;
	int dd,mm,yyyy;
	
	void getInput()
	{
		System.out.print("Enter your name: ");
		name=yash.nextLine();
		System.out.print("Enter your date of birth: ");
		dd=yash.nextInt();
		System.out.print("Enter your month of birth: ");
		mm=yash.nextInt();
		System.out.print("Enter your year of birth: ");
		yyyy=yash.nextInt();
	}
	void display()
	{
		LocalDate today=LocalDate.now();
		LocalDate birthdate=LocalDate.of(yyyy,mm,dd);
		Period p=Period.between(birthdate,today);
		
		System.out.println("\n-----| OUTPUT |-----\n");
		System.out.print("Name:"+name);
		if(p.getDays()==0)
		{
			System.out.print("\nHappy Birthday To You");
		}
		else
		{
			System.out.print("\nToday Is Not My Birthday");
		}

		System.out.print("\nDisplaying Your Age:");
		System.out.print("\n"+p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days\n");

	}
	public static void main(String[] args)
	{
		p17 obj=new p17();
		obj.getInput();
		obj.display();
	}
}